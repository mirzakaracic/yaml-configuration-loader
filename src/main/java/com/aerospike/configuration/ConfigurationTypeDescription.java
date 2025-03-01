package com.aerospike.configuration;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.yaml.snakeyaml.TypeDescription;

import com.aerospike.configuration.serializers.DynamicConfiguration;
import com.aerospike.configuration.serializers.StaticConfiguration;
import com.aerospike.configuration.util.YamlFieldNameStrategies;

public class ConfigurationTypeDescription {
    private Map<Class<?>, TypeDescription> cache;
    private Set<Class<?>> visited;

    ConfigurationTypeDescription() {
        this.cache = new HashMap<>();
        this.visited = new HashSet<>();
    }

    public Map<Class<?>, TypeDescription> buildTypeDescriptions(String packagePath, Class<?> rootClass) {
        buildTypeDescriptionsHelper(packagePath, rootClass);
        return cache;
    }

    private void buildTypeDescriptionsHelper(String packagePath, Class<?> clazz) {
        if (visited.contains(clazz)) {
            return;
        }
        visited.add(clazz);

        TypeDescription typeDescription = new TypeDescription(clazz);
        for (Field field : clazz.getDeclaredFields()) {
            Class<?> fieldType = field.getType();

            if (field.getName().equals("staticConfiguration")) {
                typeDescription.substituteProperty("static", StaticConfiguration.class, "getStaticConfiguration", "setStaticConfiguration");
            } else if (field.getName().equals("dynamicConfiguration")) {
                typeDescription.substituteProperty("dynamic", DynamicConfiguration.class, "getDynamicConfiguration", "setDynamicConfiguration");
            } else {
                String yamlKey = YamlFieldNameStrategies.camelToSnake(field.getName());
                String capitalized = field.getName().substring(0,1).toUpperCase() + field.getName().substring(1);
                String getterName = "get" + capitalized;
                String setterName = "set" + capitalized;
                typeDescription.substituteProperty(yamlKey, fieldType, getterName, setterName);
            }


            if (isCustomPojo(packagePath, fieldType)) {
                buildTypeDescriptionsHelper(packagePath, fieldType);
            }
        }

        cache.put(clazz, typeDescription);
    }

    private boolean isCustomPojo(String packagePath, Class<?> type) {
        if (type.isPrimitive()) return false; // does not apply to primitives
        if (!type.getName().startsWith(packagePath)) return false; // does not apply to POJO's outside given package path pattern
        return !type.isEnum();
    }
}
