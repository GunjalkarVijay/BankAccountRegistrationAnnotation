package com.codingNinjas.Bank.Account.Registration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("currentAccount")
@Scope("prototype")
public class currentAccount implements Account{

    private double amount=0;
    
    @PostConstruct
    public void init() {
    	System.out.println("Current Account has been created and I'm the init() method");
    }

    public void setBalance(double balance) {
        this.amount = balance;
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }

    @Override
    public void addBalance(double balance) {
        this.amount += balance;
    }

    @Override
    public double getBalance() {
        return this.amount;
    }
}
