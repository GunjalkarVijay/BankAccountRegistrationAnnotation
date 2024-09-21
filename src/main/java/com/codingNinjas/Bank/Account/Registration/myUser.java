package com.codingNinjas.Bank.Account.Registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("myUser")
@Scope("singleton")
public class myUser implements User{

    private String name="";
    private List<Account> accountList = new ArrayList<>();
    
    @PostConstruct
    public void init() {
    	System.out.println("User bean has been instantiated and I'm the init() method");
    }
    
    @PreDestroy
    public void destroy() {
    	System.out.println("User bean has been closed and I'm the destroy() method");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setUserDetails(String name) {
        this.name = name;
    }

    @Override
    public void addAccount(Account account) {
        this.accountList.add(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return this.accountList;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
