package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    FieldInjection
 */
@Component
public class BasketballController implements Sport{
    private Service service;

    public BasketballController() {
        System.out.println("Field Injection");
    }

    @Autowired
    public void anyMethod(@Qualifier("basketballService") Service service){
        this.service = service;
        System.out.println(letsPlay());
    }

    @Override
    public String letsPlay() {
        return "letsPlay " + service.getName();
    }
}
