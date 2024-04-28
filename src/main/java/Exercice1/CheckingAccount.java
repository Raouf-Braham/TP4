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
public class CheckingAccount extends BankAccount
{
    
    private Double overdraftAllowed;

    public CheckingAccount(Integer accountNumber, Double balance) {
        super(accountNumber, balance);
        this.overdraftAllowed = 0.0;
    }


    public void setOverdraftAllowed(Double overdraftAllowed) 
    {
        this.overdraftAllowed = overdraftAllowed;
    }

    public Double getOverdraftAllowed() 
    {
        return overdraftAllowed;
    }

    @Override
    public void withdraw(double amount) {
        
        if (balance - amount < 0 && Math.abs(balance - amount) > overdraftAllowed) 
        {
            System.out.println("Limite de découvert dépassée !");
        } 
        
        else 
        {
            balance -= amount;
        }
    }
}
