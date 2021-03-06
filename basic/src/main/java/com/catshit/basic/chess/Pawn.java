package com.catshit.basic.chess;

/**
 * @author liuqiangqiang
 */
public class Pawn {

    public static final String WHITE = "white";
    public static final String BLACK = "black";

    private String color;

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this.color = WHITE;
    }

    public String getColor() {
        return color;
    }
}
