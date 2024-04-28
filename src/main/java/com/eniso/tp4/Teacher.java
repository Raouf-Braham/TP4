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
public class Teacher extends User
{
    private Long hIndex;
    private List<Course> courses;
    
    public Teacher(String firstName, String lastName, String email, Long cin, Long hIndex, List<Course> courses)
    {
        super(firstName, lastName, email, cin);
        this.courses = courses;
        this.hIndex = hIndex;
        this.courses = courses;
        
    }
    
    public void displayInfo()
    {
        System.out.println("Teacher First Name : " + super.getFirstName() + " Last Name : " + super.getLastName() + " Email : " + super.getEmail() + " CIN : " + super.getCin() + " Index h : " + this.hIndex);
        for (Course course : this.courses) {
            System.out.println("Course Name: " + course.getName());
            System.out.println("Course Contents: " + course.getContents());
            System.out.println("Course Coeff: " + course.getCoef());
            System.out.println(); // Add a blank line for better readability
}

    }
    
    public void updateProfile(String NewFirstName, String NewLastName, String NewEmail, Long NewCIN, Long NewhIndex, List<Course> NewCourses)
    {
        super.setFirstName(NewFirstName);
        super.setLastName(NewLastName);
        super.setEmail(NewEmail);
        super.setCin(NewCIN);
        this.hIndex = NewhIndex;
        this.courses = NewCourses;
    }
    
    public boolean authenticate()
    {
        return true;
    }
    
    public void displayCoursesContent(){
        for(Course element  : this.courses)
            System.out.println("Nom Cours : " + element.getName() + " Content : " + element.getContents());
    }
    
}
