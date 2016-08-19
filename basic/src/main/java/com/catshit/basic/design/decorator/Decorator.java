package com.catshit.basic.design.decorator;

import com.catshit.basic.design.Sourceable;

/**
 * @author Leon
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("===============Before method===============");
        source.method();
        System.out.println("===============After method================");
    }

    public static void main(String[] args) {
        Sourceable source = new Source();

        Sourceable decorator = new Decorator(source);

        decorator.method();

        Sourceable source1 = new Source1();

        decorator = new Decorator(source1);

        decorator.method();

    }
}
