package com.company;

import java.util.Random;

public class CoffeeBeanOrganizer{

    //INSTANCE VARIABLES
    private int currentSize = 0;
    private CoffeeBeans[] inventory;
    private String coffeeBeanName;
    private String country;

    CoffeeBeans cb = new CoffeeBeans(0,0,0,"");
    //CONSTRUCTURE
    public CoffeeBeanOrganizer(){

        this.coffeeBeanName = coffeeBeanName;
        this.country = country;
        this.inventory = new CoffeeBeans[5];
    }

    //GETTERS
    public int getCurrentSize() {
        return currentSize;
    }
    public CoffeeBeans[] getInventory() {
        return inventory;
    }
    public String getCoffeeBeanName() {
        return coffeeBeanName;
    }
    public String getCountry() {
        return country;
    }
    public void serialNum(){
        Random rand = new Random();

    }

    //SETTERS
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
    public void setInventory(CoffeeBeans[] inventory) {
        this.inventory = inventory;
    }
    public void setCoffeeBeanName(String coffeeBeanName) {
        this.coffeeBeanName = coffeeBeanName;
    }
    public void setCountry(String country) {
        this.country = country;
    }


    //ADD BEANS
    public void addBean(CoffeeBeans bean){
        boolean exists = false;
        for (int i=0 ;i<currentSize; i++){
            if(bean.getCoffeeBeanId() == inventory[i].getCoffeeBeanId()){
                exists = false;
            }
        }
        if(exists != true && currentSize == inventory.length){
            CoffeeBeans[] tempBean = new CoffeeBeans[currentSize+5];
            for(int i = 0; i < currentSize; i++){
                tempBean[i] = inventory[i];
            }
            inventory = tempBean;
        }
        if(exists != true){
            inventory[currentSize] = bean;
            currentSize++;
        }
    }

    //set Height
    public void whatsTheHeight(){
        Random rand = new Random();
        cb.setHeight(rand.nextInt(3000,13000));
    }

    //print the details
    public void printDetails(){
        System.out.println();
        System.out.println(toString());
        for(int i =0; i<90;i++){
            System.out.print("-");
        }

        System.out.println();
        for (int i = 0; i < currentSize; i++) {
            System.out.println(inventory[i].toString());
            System.out.println();
        }
    }






}

