/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.calculator.service;

import javax.enterprise.util.AnnotationLiteral;

/**
 *
 * @author albert.gonzalez
 */
public class OperationNameLiteral extends AnnotationLiteral<OperationName> implements OperationName {
    final String expectedName;

    public OperationNameLiteral(String expectedName) {
        this.expectedName = expectedName;
    }

    @Override
    public String value() {
        return expectedName;
    }
    
    
}
