package com.catshit.basic.design.factory.abstractFactory;


import com.catshit.basic.design.factory.Sender;
import com.catshit.basic.design.factory.SmsSender;

/**
 * @author Leon
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
