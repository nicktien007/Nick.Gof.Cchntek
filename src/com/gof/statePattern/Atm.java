package com.gof.statePattern;

import com.gof.statePattern.state.IAtmState;
import com.gof.statePattern.state.NoCash;

/**
 * context
 */
public class Atm {
    public IAtmState getState() {
        return state;
    }

    public void setState(IAtmState state) {
        this.state = state;
    }

    private IAtmState state;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    private int cash;


    public Atm() {
        this.state = new NoCash(this);
    }

    public void withdraw(int amount){
        this.state.withdraw(amount);
    }

    public void deposit(int amount){
        this.state.deposit(amount);
    }
}
