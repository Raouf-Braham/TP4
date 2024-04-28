/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter


/**
 *
 * @author HP
 */
public class StaffMember extends User
{
    private String qualification;
    private Integer experience;
    private List<String> tasks;
    
    public StaffMember(String firstName, String lastName, String email, Long cin, String qualification, Integer experience, List<String> tasks)
    {
        super(firstName, lastName, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
        
    }
    
    public void displayInfo()
    {
        System.out.println("StaffMember First Name : " + super.getFirstName() + " Last Name : " + super.getLastName() + " Email : " + super.getEmail() + " CIN : " + super.getCin() + " Qualification : " + this.qualification + " Experience : " + this.experience + " Tasks : " + this.tasks);
    }
    
    public void updateProfile(String NewFirstName, String NewLastName, String NewEmail, Long NewCIN, String NewQualification, Integer NewExperience, List<String> Newtasks)
    {
        super.setFirstName(NewFirstName);
        super.setLastName(NewLastName);
        super.setEmail(NewEmail);
        super.setCin(NewCIN);
        this.qualification = NewQualification;
        this.experience = NewExperience;
        this.tasks = Newtasks;
    }
    
    public boolean authenticate()
    {
        return true;
    }
    
    public void finishTask(String taskName) {
    tasks.removeIf(task -> task.equals(taskName));
}



}
