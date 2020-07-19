package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    Field Injection
 */
@Component
public class RugbyController implements Sport{
    @Autowired
    @Qualifier("rugbyService")
    private Service service;

    public RugbyController() {
        System.out.println("Field Injection");
    }

    @Override
    public String letsPlay() {
        return "letsPlay " + service.getName();
    }
}
