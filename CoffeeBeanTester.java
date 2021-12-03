package com.company;
import java.util.Random;

public class CoffeeBeanTester {

    public static void main(String args[]) {
        CoffeeBeanOrganizer cbo1 = new CoffeeBeanOrganizer();
        CoffeeBeans cb1 = new CoffeeBeans(9000, 7, 93643, "Cuba");
        Random rand = new Random();

        //The first Coffee Bean
        cbo1.addBean(cb1);
        cb1.setCoffeeBeanId(17);
        cbo1.printDetails();

        //The second Coffee Bean
        CoffeeBeans cb2 = new CoffeeBeans(3000, 4, 7254, "China");
        cbo1.addBean(cb2);
        cb2.setCoffeeBeanId(17);
        cbo1.printDetails();

        //The third Coffee bean
        CoffeeBeans cb3 = new CoffeeBeans(10835, 3, 8263, "Brill");
        cbo1.addBean(cb3);
        cb3.setCoffeeBeanId(rand.nextInt(100));
        while(cb3.getCoffeeBeanId() ==cb2.getCoffeeBeanId()){
            cb3.setCoffeeBeanId(rand.nextInt(100));
        }

        //The fourth one
        CoffeeBeans cb4 = new CoffeeBeans(10835, 9, 6395, "Costa Rica");
        cbo1.addBean(cb4);
        cb4.setCoffeeBeanId(rand.nextInt(100));
         while(cb4.getCoffeeBeanId() ==cb3.getCoffeeBeanId()){
            cb4.setCoffeeBeanId(rand.nextInt(100));
        }

        //Fifth
        CoffeeBeans cb5 = new CoffeeBeans(6375, 2, 7295, "Ethiopia");
        cbo1.addBean(cb5);
        cb5.setCoffeeBeanId(rand.nextInt(100));
        while(cb5.getCoffeeBeanId() ==cb4.getCoffeeBeanId()){
            cb5.setCoffeeBeanId(rand.nextInt(100));
        }


        CoffeeBeans cb6 = new CoffeeBeans(9375, 5, 1624, "Jamaica");
        cbo1.addBean(cb6);
        cb6.setCoffeeBeanId(rand.nextInt(100));
        while(cb6.getCoffeeBeanId() ==cb5.getCoffeeBeanId()){
            cb6.setCoffeeBeanId(rand.nextInt(100));
        }

        CoffeeBeans cb7 = new CoffeeBeans(2384, 1,7926, "Colombia" );
        cbo1.addBean(cb7);
        cb7.setCoffeeBeanId(rand.nextInt(100));
        while(cb7.getCoffeeBeanId() ==cb6.getCoffeeBeanId()){
            cb7.setCoffeeBeanId(rand.nextInt(100));
        }

        cbo1.printDetails();
    }
}
