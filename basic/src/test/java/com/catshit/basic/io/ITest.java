package com.catshit.basic.io;

import com.catshit.basic.reflect.B;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author Leon
 */
public class ITest {
    @Test
    public void testAdd() {
        Method[] methods = B.class.getMethods();

        Method[] declaredMethods = B.class.getDeclaredMethods();

        System.out.println(12123);

    }
}
