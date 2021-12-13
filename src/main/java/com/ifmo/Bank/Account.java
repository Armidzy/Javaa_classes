package com.ifmo.Bank;

public class Account {
    private  long id;
    private double amount;
    private long userID;
    private boolean blocked;

    public Account (long userID){
        this.userID=userID;
        amount=0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addAmount(double amount) {
        this.amount = ++amount;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public long getUserID() {
        return userID;
    }

    public boolean isBlocked() {
        return blocked;
    }
}
