package com.catshit.basic.extend;

/**
 * @author Leon
 */
public class SprinklerSystem {
    private String value1, value2, value3, value4;
    // 组合方式
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "value1=" + value1 + ",value2=" + value2 +
                ",value3=" + value3 + ",value4=" + value4 + ",i=" + i +
                ",f=" + f + ",source=" + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerStystem = new SprinklerSystem();
        System.out.println(sprinklerStystem);
    }
}
