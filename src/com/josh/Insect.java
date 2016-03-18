package com.josh;

/**
 * Created by ec0662sr on 3/17/2016.
 */
public class Insect {
    String name;
    int wings;
    static final int legs = 6;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

//Constructor
    public Insect(String name, int wings) {
        this.name = name;
        this.wings = wings;
    }


}
