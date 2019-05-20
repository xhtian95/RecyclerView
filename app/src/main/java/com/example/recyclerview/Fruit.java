package com.example.recyclerview;

public class Fruit {
    private String name;
    private int imageId;
    private String label;
    private String justForTest;
    private String nonono;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
