package com.company;
import java.util.Random;

public class CoffeeBeans {
    private int height; //int feet
    private int roastedLevel;
    private int weight; //in grams
    private String area;
    private int coffeeBeanId;

    //CONSTRUCTURE


    public CoffeeBeans(int height, int roastedLevel, int weight, String area) {
        this.height = height;
        this.roastedLevel = roastedLevel;
        this.weight = weight;
        this.area = area;
    }

    //GETTERS
    public int getHeight() {
        return height;
    }

    public int getRoastedLevel() {
        return roastedLevel;
    }

    public int getWeight() {
        return weight;
    }

    public String getArea() {
        return area;
    }

    public int getCoffeeBeanId() {
        return coffeeBeanId;
    }

    //SETTERS
    public void setHeight(int height) {
        this.height = height;
    }

    public void setRoastedLevel(int roastedLevel) {
        this.roastedLevel = roastedLevel;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCoffeeBeanId(int coffeeBeanId) {
        this.coffeeBeanId = coffeeBeanId;
    }

    public void generateID(){
        Random rand = new Random();
        coffeeBeanId = rand.nextInt(100);
    }

    //ToString
    public String toString() {
        return "CoffeeBeans{" +
                "height=" + height +
                ", roastedLevel=" + roastedLevel +
                ", weight=" + weight +
                ", area='" + area + '\'' +
                ", coffeeBeanId=" + coffeeBeanId +
                '}';
    }


}
