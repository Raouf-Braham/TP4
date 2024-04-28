/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.tp4;

import java.util.List;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author HP
 */

@Getter
@Setter
public class User
{
    
    private String firstName;
    private String lastName;
    private String email;
    private Long cin;
    
    public User(String firstName, String lastName, String email, Long cin)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email; 
        this.cin = cin;
    }
    
    public void displayInfo()
    {
        System.out.println("User First Name : " + this.firstName + " Last Name : " + this.lastName + " Email : " + this.email + " CIN : " + this.cin);
    }
    
    public void updateProfile(String NewfirstName, String NewlastName, String Newemail, Long NewCin)
    {
        this.firstName = NewfirstName;
        this.lastName = NewlastName;
        this.email = Newemail; 
        this.cin = NewCin;       

    }
    
    public boolean authenticate()
    {
        return true;
    }
}



