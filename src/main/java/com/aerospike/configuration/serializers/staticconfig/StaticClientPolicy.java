package com.aerospike.configuration.serializers.staticconfig;

public class StaticClientPolicy {
    private int configurationCheckOnTendInterval;
    private int maxConnectionsPerNode;
    private int minConnectionsPerNode;
    private int asyncMaxConnectionsPerNode;
    private int asyncMinConnectionsPerNode;

    public StaticClientPolicy(int configurationCheckOnTendInterval, int maxConnectionsPerNode, int minConnectionsPerNode, int asyncMaxConnectionsPerNode, int asyncMinConnectionsPerNode) {
        this.configurationCheckOnTendInterval = configurationCheckOnTendInterval;
        this.maxConnectionsPerNode = maxConnectionsPerNode;
        this.minConnectionsPerNode = minConnectionsPerNode;
        this.asyncMaxConnectionsPerNode = asyncMaxConnectionsPerNode;
        this.asyncMinConnectionsPerNode = asyncMinConnectionsPerNode;
    }

    public int getConfigurationCheckOnTendInterval() {
        return this.configurationCheckOnTendInterval;
    }

    public void setConfigurationCheckOnTendInterval(int configurationCheckOnTendInterval) {
        this.configurationCheckOnTendInterval = configurationCheckOnTendInterval;
    }

    public int getMaxConnectionsPerNode() {
        return this.maxConnectionsPerNode;
    }

    public void setMaxConnectionsPerNode(int maxConnectionsPerNode) {
        this.maxConnectionsPerNode = maxConnectionsPerNode;
    }

    public int getMinConnectionsPerNode() {
        return this.minConnectionsPerNode;
    }

    public void setMinConnectionsPerNode(int minConnectionsPerNode) {
        this.minConnectionsPerNode = minConnectionsPerNode;
    }

    public int getAsyncMaxConnectionsPerNode() {
        return this.asyncMaxConnectionsPerNode;
    }

    public void setAsyncMaxConnectionsPerNode(int asyncMaxConnectionsPerNode) {
        this.asyncMaxConnectionsPerNode = asyncMaxConnectionsPerNode;
    }

    public int getAsyncMinConnectionsPerNode() {
        return this.asyncMinConnectionsPerNode;
    }

    public void setAsyncMinConnectionsPerNode(int asyncMinConnectionsPerNode) {
        this.asyncMinConnectionsPerNode = asyncMinConnectionsPerNode;
    }

}
