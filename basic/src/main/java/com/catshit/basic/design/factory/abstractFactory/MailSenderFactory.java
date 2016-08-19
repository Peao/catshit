package com.catshit.basic.design.factory.abstractFactory;

import com.catshit.basic.design.factory.MailSender;
import com.catshit.basic.design.factory.Sender;

/**
 * @author Leon
 */
public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
