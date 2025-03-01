package com.aerospike.configuration.serializers;

public class ReadPolicy implements Policy {
    private String consistencyLevel;
    private int maxRetries;

    public String getConsistencyLevel() {
        return consistencyLevel;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setConsistencyLevel(String consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }
}
