package com.codingNinjas.Bank.Account.Registration;

import org.springframework.stereotype.Component;

@Component
public interface Account {
    String getAccountType();

    void addBalance(double balance);

    double getBalance();
}
