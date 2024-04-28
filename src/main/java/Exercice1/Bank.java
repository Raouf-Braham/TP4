/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> clients;

    public Bank() {
        this.clients = new ArrayList<>();
    }

    public void addCustomer(Customer client) {
        clients.add(client);
    }

    public void removeCustomer(Customer client) {
        clients.remove(client);
    }

    public double getTotalBalance() {
        double totalBalance = 0.0;
        for (Customer client : clients) {
            totalBalance += client.getTotalAccountBalance();
        }
        return totalBalance;
    }
}
