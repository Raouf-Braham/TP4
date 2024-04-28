/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

/**
 *
 * @author HP
 */
public class BankAccount 
{
    
    protected Integer accountNumber;
    protected Double balance;

    public BankAccount(Integer accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public Double getBalance() {
        return balance;
    }
}
