package com.gof.singletonPattern;

public class MainForSingleton {

    public static void main(String[] args) {

        Boss boss1 = new Boss();
        boss1.create(20,30);
        boss1.showTotal();

        System.out.println("==============");

        Boss boss2 = new Boss();
        boss2.create(10,10);
        boss2.showTotal();
    }
}
