package model.entities;

import model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, Double balance, String holder, Double withdrawLimit) {
        this.number = number;
        this.balance = balance;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        } else if (amount > balance) {
            throw new DomainException("Not enough balance");
        } else {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "New balance: " + String.format("%.2f", this.balance);
    }

}
