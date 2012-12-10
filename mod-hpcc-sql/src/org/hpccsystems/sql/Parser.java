package org.hpccsystems.sql;

import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Arjuna Chala
 * Date: 12/8/12
 * Time: 6:48 PM
 */
public final class Parser {
    private List<FromItem> fromItemList;

    public Parser(String sql) throws Exception {
        fromItemList = new ArrayList<FromItem>();

        CCJSqlParserManager parserManager = new CCJSqlParserManager();
        Select body = (Select) parserManager.parse(new StringReader(sql));
        PlainSelect select = (PlainSelect) body.getSelectBody();

        if (select.getFromItem() instanceof net.sf.jsqlparser.schema.Table) {
            Table table = new Table();

            net.sf.jsqlparser.schema.Table jsqlTbl = (net.sf.jsqlparser.schema.Table) select.getFromItem();
            table.setName(jsqlTbl.getName());
            table.setAlias(jsqlTbl.getAlias());
            table.setSchema(jsqlTbl.getSchemaName());

            FromItem fromItem = new FromItem();
            fromItem.setLeftTable(table);

            if (select.getJoins() != null && select.getJoins().size() > 0) {
                Table rightTable = new Table();
                Join join  = (Join) select.getJoins().get(0);
                net.sf.jsqlparser.schema.Table rightJsqlTbl = (net.sf.jsqlparser.schema.Table) join.getRightItem();
                rightTable.setName(rightJsqlTbl.getName());
                rightTable.setAlias(rightJsqlTbl.getAlias());
                rightTable.setSchema(rightJsqlTbl.getSchemaName());

                fromItem.setRightTable(table);
            }
        }

    }

    public List<FromItem> getFromItemList() {
        return fromItemList;
    }


}
