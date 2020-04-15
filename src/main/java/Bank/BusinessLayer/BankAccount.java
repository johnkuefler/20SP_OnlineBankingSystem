/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank.BusinessLayer;

/**
 *
 * @author johnk
 */
public class BankAccount {
    private int accountNumber;
    private String name;
    private double currentBalance;
    private BankAccountType type;
    private int userId;

    public BankAccount(int accountNumber, String name, double currentBalance, BankAccountType type, int userId) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.currentBalance = currentBalance;
        this.type = type;
        this.userId = userId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BankAccountType getType() {
        return type;
    }

    public void setType(BankAccountType type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", name=" + name + ", currentBalance=" + currentBalance + ", type=" + type + ", userId=" + userId + '}';
    }
}
