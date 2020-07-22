package com.gof.statePattern.state;

public interface IAtmState {
    void withdraw(int amount);

    void deposit(int amount);
}
