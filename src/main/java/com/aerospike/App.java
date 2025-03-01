package com.aerospike;

import com.aerospike.configuration.YamlConfigurationManager;
import com.aerospike.configuration.serializers.Configuration;

import java.io.IOException;

public class App {

    public static void main(String[] args)
            throws InterruptedException, IOException {
        YamlConfigurationManager fileConfigurationManager = new YamlConfigurationManager();

        while (true) {
            Configuration configuration = fileConfigurationManager.fetchConfiguration();
            if (configuration != null) System.out.println(configuration.toString());

            Thread.sleep(2000);
        }
    }
}
