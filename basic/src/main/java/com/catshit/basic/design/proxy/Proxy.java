package com.catshit.basic.design.proxy;

import com.catshit.basic.design.Sourceable;
import com.catshit.basic.design.decorator.Source;

/**
 * @author Leon
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        before();
    }

    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("after");
    }


    public static void main(String[] args) {
        Sourceable proxy = new Proxy();
        proxy.method();
    }
}
