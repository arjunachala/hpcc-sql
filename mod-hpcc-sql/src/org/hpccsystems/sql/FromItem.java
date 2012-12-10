package org.hpccsystems.sql;

/**
 * User: Arjuna Chala
 * Date: 12/8/12
 * Time: 7:48 PM
 */
public class FromItem {

    private Table leftTable;
    private Table rightTable;
    private JoinType joinType;
    private FromItem parentFromItem;

    public Table getLeftTable() {
        return leftTable;
    }

    public void setLeftTable(Table leftTable) {
        this.leftTable = leftTable;
    }

    public Table getRightTable() {
        return rightTable;
    }

    public void setRightTable(Table rightTable) {
        this.rightTable = rightTable;
    }

    public JoinType getJoinType() {
        return joinType;
    }

    public void setJoinType(JoinType joinType) {
        this.joinType = joinType;
    }

    public FromItem getParentFromItem() {
        return parentFromItem;
    }

    public void setParentFromItem(FromItem parentFromItem) {
        this.parentFromItem = parentFromItem;
    }
}
