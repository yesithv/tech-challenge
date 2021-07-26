/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tech.challenge;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Equipo 30
 */
public class NewClassTest {
    
    public NewClassTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
 
    /**
     * Test of getVersion method, of class NewClass.
     */
    @org.junit.jupiter.api.Test
    public void testGetVersion() {
        System.out.println("getVersion");
        NewClass instance = new NewClass();
        Integer expResult = 0;
        Integer result = instance.getVersion();
        assertEquals(expResult, result);
    }


    /**
     * Test of summ method, of class NewClass.
     */
    @org.junit.jupiter.api.Test
    public void testSumm() {
        System.out.println("summ");
        double a = 2.0;
        double b = 3.0;
        NewClass instance = new NewClass();
        Double expResult = 5.0;
        Double result = instance.summ(a, b);
        assertEquals(expResult, result);

    }
    
}
