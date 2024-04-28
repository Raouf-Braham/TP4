/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.tp4;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

/**
 *
 * @author HP
 */
public class Course 
{
    
    private String name;
    private List<String> contents;
    private Float coef;
    
    public Course(String name, List<String> contents,Float coef)
    {
        this.name = name;
        this.coef = coef;
        this.contents = contents;
    }
    
    
    
}
