package com.catshit.design.factory;

/**
 * @author Leon
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("SMS Sender");
    }
}
