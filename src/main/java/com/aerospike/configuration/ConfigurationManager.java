package com.aerospike.configuration;

import com.aerospike.configuration.serializers.Configuration;

public abstract class  ConfigurationManager {

    abstract Configuration fetchConfiguration();
}