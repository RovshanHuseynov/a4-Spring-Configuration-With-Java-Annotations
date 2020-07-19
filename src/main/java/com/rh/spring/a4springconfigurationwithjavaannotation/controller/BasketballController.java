package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    Method Injection
 */
@Component
public class BasketballController implements Sport{
    private Service service;

    public BasketballController() {
        System.out.println("Method Injection");
    }

    @Autowired
    @Qualifier("basketballService")
    public void anyMethod(Service service){
        this.service = service;
        System.out.println(letsPlay());
    }

    @Override
    public String letsPlay() {
        return "letsPlay " + service.getName();
    }
}
