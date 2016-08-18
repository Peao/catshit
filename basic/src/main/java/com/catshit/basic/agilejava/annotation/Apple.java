package com.catshit.basic.agilejava.annotation;

/**
 * @author Leon
 */
public class Apple {
    @FruitName("苹果")
    private String name;
    @FruitColor(FruitColor.Color.RED)
    private String color;
    @FruitProvider(id = 1, name = "红富士集团", address = "广渠门外1888号")
    private String provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
