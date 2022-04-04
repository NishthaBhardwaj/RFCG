package com.nishthasoft.dto;

public class Entity {

    private int val;
    public String type;

    private Entity() {
        this(0,"id");
    }

    public Entity(int val, String type) {
        System.out.println("called");
        this.val = val;
        this.type = type;
    }

    private int getInt(){
        System.out.println("called");
        return 5;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
