package com.aerospike.configuration.serializers;

public class Read {
    private String consistencyLevel;

    public String getConsistencyLevel() {
        return consistencyLevel;
    }

    public void setConsistencyLevel(String consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }


    @Override
    public String toString() {
        return "{" +
            " consistencyLevel='" + getConsistencyLevel() + "'" +
            "}";
    }

}
