package com.aerospike.configuration.serializers;

public class StaticConfiguration {
    private ClientPolicy clientPolicy;
    private Connection connection;
    private Query query;
    private Batch batch;
    private Scan scan;
    private Write write;
    private Read read;

    public ClientPolicy getClientPolicy() {
        return this.clientPolicy;
    }

    public void setClientPolicy(ClientPolicy clientPolicy) {
        this.clientPolicy = clientPolicy;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Query getQuery() {
        return this.query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Batch getBatch() {
        return this.batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public Scan getScan() {
        return this.scan;
    }

    public void setScan(Scan scan) {
        this.scan = scan;
    }

    public Write getWrite() {
        return this.write;
    }

    public void setWrite(Write write) {
        this.write = write;
    }

    public Read getRead() {
        return this.read;
    }

    public void setRead(Read read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "{" +
            " clientPolicy='" + getClientPolicy() + "'" +
            ", connection='" + getConnection() + "'" +
            ", query='" + getQuery() + "'" +
            ", batch='" + getBatch() + "'" +
            ", scan='" + getScan() + "'" +
            ", write='" + getWrite() + "'" +
            ", read='" + getRead() + "'" +
            "}";
    }

}
