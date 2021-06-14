package com.gmail.calculator2;

public enum Theme {
    CUSTOM(R.style.Theme_Calculator2_Custom, "custom"),
    DEFAULT(R.style.Theme_Calculator2, "default");


    Theme(int resource, String key) {
        this.resource = resource;
        this.key = key;
    }
    private int resource;
    private String key;

    public int getResource() {
        return resource;
    }

    public String  getKey() {
        return key;
    }
}
