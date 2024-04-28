/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Customer 
{
    private String firstName;
    private String lastName;
    private List<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        if (account != null)
        {
            accounts.add(account);
        } 
        
        else 
        {
            System.out.println("Account cannot be null...");
        }
    }

    public void removeAccount(BankAccount account) 
    {
        if (account != null)
        {
            accounts.remove(account);
        }
        
        else 
        {
            System.out.println("Le compte ne peut pas être nul...");
        }
    }

    public double getTotalAccountBalance() 
    {
        double totalBalance = 0.0;
        for (BankAccount account : accounts) 
        {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public boolean transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, double amount) 
    {
        if (sourceAccount == null || destinationAccount == null || amount <= 0) 
        {
            System.out.println("Arguments invalides pour le transfert de fonds...");
        }

        if (!accounts.contains(sourceAccount)) 
        {
            System.out.println("Compte source non trouvé pour ce client...");
        }

        if (sourceAccount.getBalance() < amount) 
        {
            System.out.println("Fonds insuffisants dans le compte source !");
        }

        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
        return true;
    }
}
