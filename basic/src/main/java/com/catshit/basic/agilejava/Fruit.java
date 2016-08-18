package com.catshit.basic.agilejava;

import com.catshit.basic.agilejava.annotation.FruitName;

/**
 * @author Leon
 */
public class Fruit {
    @FruitName
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
