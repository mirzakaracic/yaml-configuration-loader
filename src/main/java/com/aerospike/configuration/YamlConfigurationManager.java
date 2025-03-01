package com.aerospike.configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import com.aerospike.configuration.serializers.Configuration;

public class YamlConfigurationManager extends ConfigurationManager {
    private static final String configurationPathEnv = "CONFIGURATION_PATH";
    private static final String configurationPathProp = "configuration.path";
    private static final String yamlSerializersPath = "com.aerospike.configuration.serializers.";

    private static final String configurationPath = System.getenv().getOrDefault(configurationPathEnv, System.getProperty(configurationPathProp, "."));

    @Override
    public Configuration fetchConfiguration() {
        ConfigurationTypeDescription configurationTypeDescription = new ConfigurationTypeDescription();
        LoaderOptions yamlLoaderOptions = new LoaderOptions();

        Map<Class<?>, TypeDescription> typeDescriptions = configurationTypeDescription.buildTypeDescriptions(yamlSerializersPath, Configuration.class);
        Constructor typeDescriptionConstructor = new Constructor(Configuration.class, yamlLoaderOptions);
        Yaml yaml = new Yaml(typeDescriptionConstructor);

        typeDescriptions.values().forEach(typeDescriptionConstructor::addTypeDescription);
        try(FileInputStream fileInputStream = new FileInputStream(configurationPath)) {
            Configuration configuration = yaml.load(fileInputStream);
            return configuration;
        } catch (FileNotFoundException e) {
            System.out.println(String.format("Configuration file could not be read from %s. Will fall back to default settings.", configurationPath));
        } catch (IOException ioException) {
            System.out.println(String.format("Configuration file could not be read from %s. Make sure configuration is valid YAML file. Will fall back to default settings.", configurationPath));
        }

        return null;
    }
}
