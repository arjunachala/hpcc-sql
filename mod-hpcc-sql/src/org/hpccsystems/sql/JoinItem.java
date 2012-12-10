package org.hpccsystems.sql;

/**
 * User: Arjuna Chala
 * Date: 12/8/12
 * Time: 7:48 PM
 */
public class JoinItem {
    private Table table;
    private JoinType joinType;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public JoinType getJoinType() {
        return joinType;
    }

    public void setJoinType(JoinType joinType) {
        this.joinType = joinType;
    }

}
