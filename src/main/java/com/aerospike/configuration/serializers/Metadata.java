package com.aerospike.configuration.serializers;

public class Metadata {
    private String appName;
    private int ttlSeconds;
    private String lastUpdated;
    private int generation;
    private String version;
    private Fallback fallback;


    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getTtlSeconds() {
        return this.ttlSeconds;
    }

    public void setTtlSeconds(int ttlSeconds) {
        this.ttlSeconds = ttlSeconds;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getGeneration() {
        return this.generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Fallback getFallback() {
        return this.fallback;
    }

    public void setFallback(Fallback fallback) {
        this.fallback = fallback;
    }


    @Override
    public String toString() {
        return "{" +
            " appName='" + getAppName() + "'" +
            ", ttlSeconds='" + getTtlSeconds() + "'" +
            ", lastUpdated='" + getLastUpdated() + "'" +
            ", generation='" + getGeneration() + "'" +
            ", version='" + getVersion() + "'" +
            ", fallback='" + getFallback() + "'" +
            "}";
    }

}
