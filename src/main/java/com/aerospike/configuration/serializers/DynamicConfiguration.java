package com.aerospike.configuration.serializers;

import java.util.List;

public class DynamicConfiguration {
    private Cluster cluster;
    private Timeout timeout;
    private List<Policy> policies;

    public Cluster getCluster() {
        return cluster;
    }

    public Timeout getTimeout() {
        return timeout;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    public void setTimeout(Timeout timeout) {
        this.timeout = timeout;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        return "{" +
            " cluster='" + getCluster() + "'" +
            ", timeout='" + getTimeout() + "'" +
            ", policies='" + getPolicies() + "'" +
            "}";
    }

}
