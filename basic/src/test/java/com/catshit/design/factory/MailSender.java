package com.catshit.design.factory;

/**
 * @author Leon
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Mail Sender");
    }
}
