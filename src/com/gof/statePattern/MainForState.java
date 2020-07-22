package com.gof.statePattern;

public class MainForState {

    public static void main(String[] args) {

        Atm atm = new Atm();

        atm.deposit(100);
        atm.withdraw(50);
        atm.withdraw(30);
        atm.withdraw(20);

        atm.withdraw(10);

    }
}
