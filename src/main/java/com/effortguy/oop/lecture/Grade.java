package com.effortguy.oop.lecture;

public class Grade {
    private String name;
    private int upper, lower;

    public Grade(String name, int upper, int lower) {
        this.name = name;
        this.upper = upper;
        this.lower = lower;
    }

    public String getName() {
        return name;
    }

    public int getUpper() {
        return upper;
    }

    public int getLower() {
        return lower;
    }

    public boolean include(int score) {
        return score >= lower && score <= upper;
    }

    public boolean isName(String gradeName) {
        return this.name.equals(gradeName);
    }
}
