package org.hpccsystems.sql;

/**
 * User: Arjuna Chala
 * Date: 12/9/12
 * Time: 11:09 AM
 */
public class Table {
    private String name;
    private String alias;
    private String schema;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
