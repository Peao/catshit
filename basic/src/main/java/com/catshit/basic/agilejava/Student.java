package com.catshit.basic.agilejava;

/**
 * @author Leon
 */
public class Student {
    public static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    public static final String STATE = "CO";
    private String name;
    private int credits;
    private String state = "";

    public Student(String name) {
        this.name = name;
        this.credits = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setState(String state){
        this.state = state;
    }
    public boolean isInState() {
        return state.equals(Student.STATE);
    }
}
