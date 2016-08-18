package com.catshit.java.lang;

import junit.framework.TestCase;

/**
 * @author Leon
 */
public class IntegerTest extends TestCase {

    public void testInteger() {
        Integer integer = 123;
        assertEquals(123, integer.intValue());

        Integer integer1 = new Integer("123");
        assertEquals(123, integer1.intValue());

        int bitCount = Integer.bitCount(integer);
        System.out.println("bitCount = " + bitCount);

    }

    /**
     * 比较
     */
    public void testCompare() {
        Integer integer = 123;
        assertEquals(123, integer.intValue());

        Integer integer1 = new Integer("123");
        assertEquals(123, integer1.intValue());

        // 比较两个数的大小
        // x < y --> -1
        int compare = Integer.compare(1, 2);
        assertTrue(compare == -1);

        // x = y --> 0
        int compare1 = Integer.compare(2, 2);
        assertTrue(compare1 == 0);

        // x > y --> 1
        int compare3 = Integer.compare(4, 2);
        assertTrue(compare3 == 1);

        // 比较两个integer对象,内部调用的是compare，实际上还是值得比较
        int i = integer.compareTo(integer1);
        assertTrue(i == 0);

        // 比较正数和负数
        int compare2 = Integer.compare(1, -1);
        assertTrue(compare2 == 1);
        // 无符号的比较 TODO(UN)
        int compare4 = Integer.compareUnsigned(1, -2);
        System.out.println("compare4 = " + compare4);

        Integer decode = Integer.decode("-125263");
        System.out.println("decode = " + decode);

        int i1 = Integer.divideUnsigned(10, 2);
        System.out.println("i1 = " + i1);

        System.out.println("integer = " + integer.doubleValue());
        System.out.println("integer = " + integer.longValue());
        System.out.println("integer = " + integer.intValue());
        System.out.println("integer = " + integer.floatValue());
        System.out.println("integer = " + integer.byteValue());
        System.out.println("integer = " + integer.shortValue());
    }

}
