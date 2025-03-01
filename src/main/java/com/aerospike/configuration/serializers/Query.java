package com.aerospike.configuration.serializers;

public class Query {
    private int maxRetries;
    private int timeoutDelay;
    private String readModeAP;
    private String readModeSC;
    private String replica;

    public int getMaxRetries() {
        return maxRetries;
    }

    public int getTimeoutDelay() {
        return timeoutDelay;
    }

    public String getReadModeAP() {
        return readModeAP;
    }

    public String getReadModeSC() {
        return readModeSC;
    }

    public String getReplica() {
        return replica;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public void setTimeoutDelay(int timeoutDelay) {
        this.timeoutDelay = timeoutDelay;
    }

    public void setReadModeAP(String readModeAP) {
        this.readModeAP = readModeAP;
    }

    public void setReadModeSC(String readModeSC) {
        this.readModeSC = readModeSC;
    }

    public void setReplica(String replica) {
        this.replica = replica;
    }


    @Override
    public String toString() {
        return "{" +
            " maxRetries='" + getMaxRetries() + "'" +
            ", timeoutDelay='" + getTimeoutDelay() + "'" +
            ", readModeAP='" + getReadModeAP() + "'" +
            ", readModeSC='" + getReadModeSC() + "'" +
            ", replica='" + getReplica() + "'" +
            "}";
    }

}
