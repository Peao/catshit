package com.catshit.basic.design.decorator;

import com.catshit.basic.design.Sourceable;

/**
 * @author Leon
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("Source Method...");
    }
}
