package com.catshit.design.factory.abstractFactory;

import com.catshit.design.factory.Sender;
import com.catshit.design.factory.SmsSender;

/**
 * @author Leon
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
