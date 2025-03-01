package com.aerospike.configuration.serializers;

public class Timeout {
    private int connectionTimeout;
    private int socketTimeout;
    private int totalTimeout;

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public int getTotalTimeout() {
        return totalTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }
    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }
    public void setTotalTimeout(int totalTimeout) {
        this.totalTimeout = totalTimeout;
    }


    @Override
    public String toString() {
        return "{" +
            " connectionTimeout='" + getConnectionTimeout() + "'" +
            ", socketTimeout='" + getSocketTimeout() + "'" +
            ", totalTimeout='" + getTotalTimeout() + "'" +
            "}";
    }

}
