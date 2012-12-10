package org.hpccsystems.sql;

/**
 * User: Arjuna Chala
 * Date: 12/10/12
 * Time: 5:58 PM
 */
public class SelectItem {
    private String operationName;
    private Table table;
    private String columnName;

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
