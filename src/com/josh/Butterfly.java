package com.josh;

/**
 * Created by ec0662sr on 3/17/2016.
 */
public class Butterfly extends Insect {
    String wingColor;
    String favFlower;

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getFavFlower() {
        return favFlower;
    }

    public void setFavFlower(String favFlower) {
        this.favFlower = favFlower;
    }

    void printSpeciesData() {
        System.out.println("A " + this.name + " butterfly has " + this.legs + " legs, " + this.wings + " wings, it is " +
                this.wingColor + " and likes a plant called " + this.favFlower + ".");
    }

    //Constructor
    public Butterfly(String wingColor, String favFlower, String name, int wings) {
        super(name, wings);
        this.wingColor = wingColor;
        this.favFlower = favFlower;

    }


}



