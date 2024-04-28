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
public class Exercice1
{
    public static void main(String[] args) 
    {        
        BankAccount account = new SavingsAccount(201, 3.5);
        SavingsAccount savingsAccount = (SavingsAccount) account;
        System.out.println("Conversion explicite réussie : " + (savingsAccount != null));
        BankAccount anotherAccount = new CheckingAccount(202, 1000.0);
        CheckingAccount checkingAccount = (CheckingAccount) anotherAccount;
        System.out.println("Conversion explicite réussie : " + (checkingAccount != null));
        // Test de fonctionnalité existante
        SavingsAccount savingsAccount1 = new SavingsAccount(101, 5.0);
        savingsAccount1.deposit(1000.0);
        savingsAccount1.withdraw(200.0);
        System.out.println("Solde du compte épargne : " + savingsAccount1.getBalance());
        CheckingAccount checkingAccount1 = new CheckingAccount(102, 500.0);
        checkingAccount1.deposit(1500.0);
        checkingAccount1.withdraw(800.0);
        System.out.println("Solde du compte chèque : " + checkingAccount1.getBalance());
        Customer customer = new Customer("John", "Doe");
        customer.addAccount(savingsAccount1);
        customer.addAccount(checkingAccount1);
        System.out.println("Solde total du client : " + customer.getTotalAccountBalance());
        Bank bank = new Bank();
        bank.addCustomer(customer);
        System.out.println("Solde total de la banque : " + bank.getTotalBalance());
    }
}