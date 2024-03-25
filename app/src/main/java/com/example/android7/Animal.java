package com.example.android7;

public class Animal {
    private String name;
    private int imageResource;
    private int averageLifespan;

    public Animal(String name, int imageResource, int averageLifespan) {
        this.name = name;
        this.imageResource = imageResource;
        this.averageLifespan = averageLifespan;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getAverageLifespan() {
        return averageLifespan;
    }
}