package com.catshit.basic.design.adapter;

/**
 * 类的适配器，采用继承方式
 *
 * @author Leon
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is method2");
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
