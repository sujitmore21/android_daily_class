package com.example.recyclerview;

public class Modelclass {

    private int imageResource;
    private String title;
    private String body;

    public Modelclass(int imageResource, String title, String body) {
        this.imageResource = imageResource;
        this.title = title;
        this.body = body;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
