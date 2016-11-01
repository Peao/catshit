package com.catshit.basic.extend;

/**
 * @author Leon
 */
public class Animal {
    // 顺序2. 非静态对象
    private Serial serial = new Serial(1);
    // 顺序1. 静态对象
    private static Serial serial2 = new Serial(2);

    private static Serial serial3;
    private Serial serial4;

    // 顺序1. 静态代码块
    static {
        serial3 = new Serial(3);
    }

    // 顺序2. 非静态代码块
    {
        serial4 = new Serial(4);
    }

    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(" + name + ")");
    }

    public void say() {
        System.out.println("hello" + name);
    }
}
