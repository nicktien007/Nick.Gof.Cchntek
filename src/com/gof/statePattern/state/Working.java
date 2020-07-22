package com.gof.statePattern.state;

import com.gof.statePattern.Atm;

public class Working implements IAtmState {

    private Atm atm;

    public Working(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void withdraw(int amount) {
        //提
        int currentCash = atm.getCash();
        if (amount > currentCash)
        {
            System.out.println("超額提款!!!!");
            return;
        }

        System.out.println("提款" + amount + "元");

        int newCash = currentCash - amount;
        atm.setCash(newCash);

        //狀態轉換
        if (newCash == 0){
            this.atm.setState(new NoCash(atm));
        }
    }

    @Override
    public void deposit(int amount) {
        //存款
        System.out.println("存款" + amount + "元");
        int currentCash = atm.getCash();
        this.atm.setCash(currentCash + amount);
    }
}
