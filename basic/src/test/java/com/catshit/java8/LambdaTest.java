package com.catshit.java8;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Leon
 */
public class LambdaTest {

    @Test
    public void testLambda() {
        Arrays.asList("a", "b", "c", "d").forEach(System.out::println);
    }
}
