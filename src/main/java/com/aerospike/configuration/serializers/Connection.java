package com.aerospike.configuration.serializers;

public class Connection {
    private int maxConnectionsPerNode;
    private int minConnectionsPerNode;
    private int asyncMaxConnsPerNode;
    private int asyncMinConnsPerNode;
    private int maxSocketIdle;

    public int getMaxConnectionsPerNode() {
        return maxConnectionsPerNode;
    }

    public int getMinConnectionsPerNode() {
        return minConnectionsPerNode;
    }

    public int getAsyncMaxConnsPerNode() {
        return asyncMaxConnsPerNode;
    }

    public int getAsyncMinConnsPerNode() {
        return asyncMinConnsPerNode;
    }

    public int getMaxSocketIdle() {
        return maxSocketIdle;
    }

    public void setMaxConnectionsPerNode(int maxConnectionsPerNode) {
        this.maxConnectionsPerNode = maxConnectionsPerNode;
    }

    public void setMinConnectionsPerNode(int minConnectionsPerNode) {
        this.minConnectionsPerNode = minConnectionsPerNode;
    }

    public void setAsyncMaxConnsPerNode(int asyncMaxConnsPerNode) {
        this.asyncMaxConnsPerNode = asyncMaxConnsPerNode;
    }

    public void setAsyncMinConnsPerNode(int asyncMinConnsPerNode) {
        this.asyncMinConnsPerNode = asyncMinConnsPerNode;
    }

    public void setMaxSocketIdle(int maxSocketIdle) {
        this.maxSocketIdle = maxSocketIdle;
    }


    @Override
    public String toString() {
        return "{" +
            " maxConnectionsPerNode='" + getMaxConnectionsPerNode() + "'" +
            ", minConnectionsPerNode='" + getMinConnectionsPerNode() + "'" +
            ", asyncMaxConnsPerNode='" + getAsyncMaxConnsPerNode() + "'" +
            ", asyncMinConnsPerNode='" + getAsyncMinConnsPerNode() + "'" +
            ", maxSocketIdle='" + getMaxSocketIdle() + "'" +
            "}";
    }

}

