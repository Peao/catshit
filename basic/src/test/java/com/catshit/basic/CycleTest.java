package com.catshit.basic;

import org.junit.Test;

/**
 * @author Leon
 */
public class CycleTest {
    /**
     * 打印从1到100的值
     */
    @Test
    public void test1() {
        // 循环从1到100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /**
     * 产生25个int类型的随机数，对于每个随机数，使用if-else语句
     * 将其分类为大于、小于或等于紧随它而随机生成的值
     */
    @Test
    public void test2() {
        for (int i = 0; i < 25; i++) {
            int random = (int) (Math.random() * 10);
            System.out.println("random = " + random);
        }
    }

    @Test
    public void testInit(){
        new Str("remark");
    }
}
