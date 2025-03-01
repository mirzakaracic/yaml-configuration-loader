package com.aerospike.configuration.serializers;

public class Configuration {
    private Metadata metadata;
    private StaticConfiguration staticConfiguration;
    private DynamicConfiguration dynamicConfiguration;

    public Metadata getMetadata() {
        return this.metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public StaticConfiguration getStaticConfiguration() {
        return this.staticConfiguration;
    }

    public void setStaticConfiguration(StaticConfiguration staticConfiguration) {
        this.staticConfiguration = staticConfiguration;
    }

    public DynamicConfiguration getDynamicConfiguration() {
        return this.dynamicConfiguration;
    }

    public void setDynamicConfiguration(DynamicConfiguration dynamicConfiguration) {
        this.dynamicConfiguration = dynamicConfiguration;
    }


    @Override
    public String toString() {
        return "{" +
            " metadata='" + getMetadata() + "'" +
            ", staticConfiguration='" + getStaticConfiguration() + "'" +
            ", dynamicConfiguration='" + getDynamicConfiguration() + "'" +
            "}";
    }
}
