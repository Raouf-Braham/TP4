/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.tp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP
 */
public class Exercice2 
{
    public static void main(String[] args) 
    {
        Student student = new Student("student1", "student1", "student@email.com", 12345L, 15.0, Classe.IA1_2, Status.ADMIS);
        student.displayInfo();
        student.updateProfile("student11", "student11", "john.doe.new@email.com");
        student.displayInfo();
        boolean isAuthenticatedStudent = student.authenticate();
        System.out.println("Student Authentication: " + isAuthenticatedStudent);
        
        List<String> mathContents = Arrays.asList("Algebra", "Calculus");
        List<String> physicsContents = Arrays.asList("Mechanics", "Thermodynamics");
        
        Course mathCourse = new Course("Math", mathContents, 2.0f);
        Course physicsCourse = new Course("Physics", physicsContents, 1.5f);
        
        List<Course> teacherContent = Arrays.asList(mathCourse, physicsCourse);
        
        Teacher teacher = new Teacher("teacher1", "teacher1", "teacher1@email.com", 67890L, 12L, teacherContent);
        teacher.setHIndex(10L);
        teacher.displayInfo();
        teacher.displayCoursesContent();
        
        List<String> staffTasks = new ArrayList<>(Arrays.asList("Task1", "Task2", "Task3"));

        StaffMember staffMember = new StaffMember("member1", "member1", "member1@email.com", 11111L, "Engineer", 5, staffTasks);
        
        staffMember.displayInfo();
        staffMember.finishTask("Task2");
        staffMember.displayInfo();
    }
}
