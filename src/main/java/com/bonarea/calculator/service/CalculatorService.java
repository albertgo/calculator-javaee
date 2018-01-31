/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.calculator.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author albert.gonzalez
 */
@RequestScoped
@Named("calculatorService")
public class CalculatorService implements ICalculator{

    @Override
    public int add(int num1, int num2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return num1+num2;
    }

    @Override
    public int substract(int num1, int num2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return num1-num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return num1/num2;
    }
    
}
