package com.aerospike.configuration.serializers;

public class Fallback {
    private boolean useDefault;
    private String defaultVersion;
    private String etag;

    public String getDefaultVersion() {
        return defaultVersion;
    }

    public String getEtag() {
        return etag;
    }

    public boolean getUseDefault() {
        return this.useDefault;
    }

    public void setUseDefault(boolean useDefault) {
        this.useDefault = useDefault;
    }

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }


    @Override
    public String toString() {
        return "{" +
            " useDefault='" + getUseDefault() + "'" +
            ", defaultVersion='" + getDefaultVersion() + "'" +
            ", etag='" + getEtag() + "'" +
            "}";
    }

}
