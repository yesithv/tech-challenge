/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tech.challenge;

/**
 *
 * @author Equipo 30
 */
public class NewClass {
    
    private Integer version;
    private Integer year;
    /** Documentation of new feature */
    private Integer feature;
    
    public NewClass(){
        this.version = 0;
        this.year = 2021;
        // It's the first feature
        this.feature = 1;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    
    /**
     * Add one number to the actual year
     * 
     * @param number Number to add
     * @author Yeith Valencia
     * @since 25/07/2021
     */
    public void addToYear(int number){
        this.year += number;
    }
    
    
    public Double summ (double a, double b){
        return a+b;
    }
    
}
