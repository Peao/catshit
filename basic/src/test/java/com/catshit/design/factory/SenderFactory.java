package com.catshit.design.factory;

/**
 * 应用场景：凡是出现了大量产品需要创建，并且具有公共的接口
 *
 * @author Leon
 */
public class SenderFactory {
    public static Sender createSmsSender() {
        return new SmsSender();
    }

    public static Sender createMailSender() {
        return new MailSender();
    }
}
