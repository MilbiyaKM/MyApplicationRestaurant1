package com.emmu.myapplicationrestaurant;

public class Item {

    private String iconListName;
    private int iconListImage;


    public Item(String iconListName, int iconListImage) {

        this.iconListImage=iconListImage;
        this.iconListName=iconListName;
    }

    public int getIconListImage(){
        return iconListImage;
    }

    public String getIconListName(){
        return iconListName;
    }
}
