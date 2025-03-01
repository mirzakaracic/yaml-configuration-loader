package com.aerospike.configuration.serializers;

public class WritePolicy implements Policy {
    private String commitLevel;
    private String recordExistsAction;

    public String getCommitLevel() {
        return commitLevel;
    }

    public String getRecordExistsAction() {
        return recordExistsAction;
    }

    public void setCommitLevel(String commitLevel) {
        this.commitLevel = commitLevel;
    }
    public void setRecordExistsAction(String recordExistsAction) {
        this.recordExistsAction = recordExistsAction;
    }
}
