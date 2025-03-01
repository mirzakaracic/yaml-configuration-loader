package com.aerospike.configuration.serializers;

public class Scan {
    private boolean concurrentNodes;
    private int maxConcurrentNodes;
    private int recordsPerSecond;

    public int getMaxConcurrentNodes() {
        return maxConcurrentNodes;
    }

    public int getRecordsPerSecond() {
        return recordsPerSecond;
    }

    public boolean getConcurrentNodes() {
        return this.concurrentNodes;
    }

    public void setConcurrentNodes(boolean concurrentNodes) {
        this.concurrentNodes = concurrentNodes;
    }
    public void setMaxConcurrentNodes(int maxConcurrentNodes) {
        this.maxConcurrentNodes = maxConcurrentNodes;
    }
    public void setRecordsPerSecond(int recordsPerSecond) {
        this.recordsPerSecond = recordsPerSecond;
    }


    @Override
    public String toString() {
        return "{" +
            " concurrentNodes='" + getConcurrentNodes() + "'" +
            ", maxConcurrentNodes='" + getMaxConcurrentNodes() + "'" +
            ", recordsPerSecond='" + getRecordsPerSecond() + "'" +
            "}";
    }

}
