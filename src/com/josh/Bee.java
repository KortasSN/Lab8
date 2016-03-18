package com.josh;

/**
 * Created by ec0662sr on 3/17/2016.
 */
public class Bee extends Insect {
    String color;
    Boolean honey;
    String favFlower;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getHoney() {
        return honey;
    }

    public void setHoney(Boolean honey) {
        this.honey = honey;
    }

    public String getFavFlower() {
        return favFlower;
    }

    public void setFavFlower(String favFlower) {
        this.favFlower = favFlower;
    }


    //Constructor
    public Bee(String color, Boolean honey, String favFlower, String name, int wings) {
        super(name, wings);
        this.color = color;
        this.honey = honey;
        this.favFlower = favFlower;
    }

    void printSpeciesData() {
        if (honey = true) {
            System.out.println("A " + this.name + " has " + this.color + " color wings and produces honey. Its favorite flower is " +
                    favFlower + " and has " + this.wings + " wings.");
        }
        if (honey = false) {
            System.out.println("A " + this.name + " has " + this.color + " color wings and does not produce honey. Its favorite flower is " +
                    favFlower + " and has " + this.wings + " wings.");
        }
    }
}

