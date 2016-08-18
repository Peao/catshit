package com.catshit.design.factory.abstractFactory;

import com.catshit.design.factory.MailSender;
import com.catshit.design.factory.Sender;

/**
 * @author Leon
 */
public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
