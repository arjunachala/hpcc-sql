package org.hpccsystems.sql;

import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;

import java.io.StringReader;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception  {
        CCJSqlParserManager parserManager = new CCJSqlParserManager();

        String statement1 = "SELECT * FROM mytable1,mytable2 WHERE mytable1.id=mytable2.id and mytable1.col = 9 OFFSET ?";

        String statement2 = "SELECT * FROM schema.mytable1, schema.mytable2, schema.mytable3 where mytable1.id=mytable2.id";

        String statement3 = "SELECT * FROM (schema.mytable1 left outer join schema.mytable2 on mytable1.id=mytable2.id) left outer join schema.mytable3 on schema.mytable1.id=schema.mytable3";

        Select body = (Select) parserManager.parse(new StringReader(statement2));
        PlainSelect select = (PlainSelect) body.getSelectBody();
        System.out.println(select.getFromItem());

        if (select.getFromItem() instanceof  net.sf.jsqlparser.schema.Table)  {

        }

        System.out.println(select.getWhere());

        List<Join> joins = select.getJoins();
        if (joins != null) {
            for (Join join: joins)  {
                System.out.println(join.isSimple());
            }
        }



    }
}
