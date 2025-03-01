package com.aerospike.configuration.serializers;

public class Write {
    private boolean durableDelete;
    private String recordExistsAction;
    private String generationPolicy;

    public String getRecordExistsAction() {
        return recordExistsAction;
    }

    public String getGenerationPolicy() {
        return generationPolicy;
    }

    public boolean getDurableDelete() {
        return this.durableDelete;
    }

    public void setDurableDelete(boolean durableDelete) {
        this.durableDelete = durableDelete;
    }

    public void setRecordExistsAction(String recordExistsAction) {
        this.recordExistsAction = recordExistsAction;
    }

    public void setGenerationPolicy(String generationPolicy) {
        this.generationPolicy = generationPolicy;
    }


    @Override
    public String toString() {
        return "{" +
            " durableDelete='" + getDurableDelete() + "'" +
            ", recordExistsAction='" + getRecordExistsAction() + "'" +
            ", generationPolicy='" + getGenerationPolicy() + "'" +
            "}";
    }


}
