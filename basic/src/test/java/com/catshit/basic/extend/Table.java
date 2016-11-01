package com.catshit.basic.extend;

/**
 * @author Leon
 */
public class Table {
    private static Row row = new Row(1);

    private Row row2 = new Row(2);

    private static Row row3;
    private Row row4;

    static {
        row3 = new Row(3);
    }

    {
        row4 = new Row(4);
    }

    public Table() {
        System.out.println("Table()");
    }

    public static void main(String[] args) {
        new Table();
    }
}
