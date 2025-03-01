package com.aerospike.configuration.serializers;

public class Cluster {
    private int minConnectionPerNode;
    private int tendInterval;

    public int getMinConnectionPerNode() {
        return minConnectionPerNode;
    }

    public int getTendInterval() {
        return tendInterval;
    }

    public void setMinConnectionPerNode(int minConnectionPerNode) {
        this.minConnectionPerNode = minConnectionPerNode;
    }
    public void setTendInterval(int tendInterval) {
        this.tendInterval = tendInterval;
    }

    @Override
    public String toString() {
        return "{" +
            " minConnectionPerNode='" + getMinConnectionPerNode() + "'" +
            ", tendInterval='" + getTendInterval() + "'" +
            "}";
    }

}
