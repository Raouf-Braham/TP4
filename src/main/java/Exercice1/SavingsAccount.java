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
public class SavingsAccount extends BankAccount{
    
    private Double interestRate;

    public SavingsAccount(Integer accountNumber, Double balance) {
        super(accountNumber, balance);
        this.interestRate = 0.0;
    }
    
    public Double getInterestRate() 
    {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) 
    {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) 
    {
        if (amount > balance) 
        {
            System.out.println("Fonds insuffisants. Retrait non autorisé !");
        } 
        
        else 
        {
            balance -= amount;
            if (amount > 1000) 
            {
                balance -= 10.0; // Pénalité pour les retraits excédant 1000
                System.out.println("Retrait de " + amount + " avec une pénalité de 10.0");
            } 
            
            else 
            {
                System.out.println("Retrait de " + amount + " réussi.");
            }
        }
    }
}
