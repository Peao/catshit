package com.catshit.basic.design.factory;

import com.catshit.basic.design.factory.abstractFactory.Provider;
import com.catshit.basic.design.factory.abstractFactory.SmsSenderFactory;

/**
 * @author Leon
 */
public class FactoryMain {
    public static void main(String[] args) {
        // 静态工厂
        Sender smsSender = SenderFactory.createSmsSender();
        smsSender.send();

        // 抽象工厂
        Provider provider = new SmsSenderFactory();
        Sender smsSender1 = provider.produce();
        smsSender1.send();
    }
}
