package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.RugbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
    Field Injection
 */
@Component
public class RugbyController implements Sport{
    @Autowired
    private RugbyService rugbyService;

    public RugbyController() {
        System.out.println("Field Injection");
    }

    @Override
    public String letsPlay() {
        return "letsPlay " + rugbyService.getName();
    }
}
