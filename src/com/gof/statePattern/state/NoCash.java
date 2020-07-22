package com.gof.statePattern.state;

import com.gof.statePattern.Atm;

public class NoCash implements IAtmState {

    private Atm atm;

    public NoCash(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void withdraw(int amount) {

        System.out.println("餘額不足，無法提款!!");
    }

    @Override
    public void deposit(int amount) {
        //存款
        atm.setCash(amount);
        System.out.println("存款" + amount + "元");

        //狀態轉換
        this.atm.setState(new Working(atm));
    }
}
