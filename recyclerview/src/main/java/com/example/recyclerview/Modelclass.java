package com.example.recyclerview;

public class Modelclass {

    public static final int USER_INFO_LAYOUT= 0;
    public static final int AD_LAYOUT = 1;
    public static final int IMAGE_LAYOUT = 2;


    private int viewType;

    public int getViewType() { return viewType; }
    public void setViewType(int viewType) { this.viewType = viewType; }

    ///user info layout

    private int imageResource;
    private String title;
    private String body;

    public Modelclass(int viewType, int imageResource, String title, String body) {
        this.imageResource = imageResource;
        this.title = title;
        this.body = body;
        this.viewType=viewType;
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
    ///user info layout

    ///Ad layout

    private String adtext;

    public Modelclass(int viewType,String adtext) {
        this.adtext = adtext;
        this.viewType = viewType;
    }

    public String getAdtext() {
        return adtext;
    }

    public void setAdtext(String adtext) {
        this.adtext = adtext;
    }

    ///Ad layout

    ///Image Layout
    private  int Resource;

    public Modelclass(int viewType,int resource) {
        Resource = resource;
        this.viewType=viewType;
    }

    public int getResource() {
        return Resource;
    }

    public void setResource(int resource) {
        Resource = resource;
    }

    ///Image Layout
}
