package com.example.fishingtest;

public class MenuItem {

    String name;
    String moblie;

    public MenuItem(String name, String moblie) {
        this.name = name;
        this.moblie = moblie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }
}
