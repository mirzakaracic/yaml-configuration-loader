package com.aerospike.configuration.serializers;

public class Batch {
    private boolean allowInline;
    private boolean allowInlineSSD;
    private boolean respondAllKeys;

    public boolean getAllowInline() {
        return this.allowInline;
    }

    public void setAllowInline(boolean allowInline) {
        this.allowInline = allowInline;
    }

    public boolean getAllowInlineSSD() {
        return this.allowInlineSSD;
    }

    public void setAllowInlineSSD(boolean allowInlineSSD) {
        this.allowInlineSSD = allowInlineSSD;
    }

    public boolean getRespondAllKeys() {
        return this.respondAllKeys;
    }

    public void setRespondAllKeys(boolean respondAllKeys) {
        this.respondAllKeys = respondAllKeys;
    }

    @Override
    public String toString() {
        return "{" +
            " allowInline='" + getAllowInline() + "'" +
            ", allowInlineSSD='" + getAllowInlineSSD() + "'" +
            ", respondAllKeys='" + getRespondAllKeys() + "'" +
            "}";
    }

}
