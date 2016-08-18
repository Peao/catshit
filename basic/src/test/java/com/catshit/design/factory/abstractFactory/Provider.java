package com.catshit.design.factory.abstractFactory;

import com.catshit.design.factory.Sender;

/**
 * @author Leon
 */
public interface Provider {
    Sender produce();
}
