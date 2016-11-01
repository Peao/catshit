package com.catshit.basic.extend;

/**
 * @author Leon
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("Dog(" + name + ")");
        // 3. 先初始化基类
    }

    public static void main(String[] args) {
        new Dog("阿黄");
    }
}
