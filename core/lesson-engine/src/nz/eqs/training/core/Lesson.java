/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.eqs.training.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tendril
 */
public abstract class Lesson {
    protected List<Problem> problems;
    
    protected Lesson() {
        problems = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        
        Lesson lesson = new this();
        for(Problem p: problems) {
            
        }
    }
}
