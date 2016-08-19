package com.catshit.basic.design.factory.abstractFactory;


import com.catshit.basic.design.factory.Sender;

/**
 * @author Leon
 */
public interface Provider {
    Sender produce();
}
