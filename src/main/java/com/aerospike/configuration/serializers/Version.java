package com.aerospike.configuration.serializers;

public class Version {

    private String currentVersion;
    private String previousVersion;
    private String etag;

    public Version(String currentVersion, String previousVersion, String etag) {
        this.currentVersion = currentVersion;
        this.previousVersion = previousVersion;
        this.etag = etag;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public String getPreviousVersion() {
        return previousVersion;
    }

    public String getEtag() {
        return etag;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public void setPreviousVersion(String previousVersion) {
        this.previousVersion = previousVersion;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }
}
