package com.catshit.basic.design.factory;

/**
 * @author Leon
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("SMS Sender");
    }
}
