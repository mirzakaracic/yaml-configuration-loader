package com.aerospike.configuration;

import com.aerospike.configuration.serializers.Configuration;

public interface  ConfigurationManager {
    Configuration fetchConfiguration();
}