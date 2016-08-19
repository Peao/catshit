package com.catshit.basic.design.factory;

/**
 * 静态工厂
 * 应用场景：凡是出现了大量产品需要创建，并且具有公共的接口
 * <p>
 * 缺点：类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改
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
