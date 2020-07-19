package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    Setter Injection
 */
@Component
public class FootballController implements Sport{
    private Service service;

    public FootballController() {
        System.out.println("Setter Injection");
    }

    @Autowired
    @Qualifier("footballService")
    public void setService(Service service) {
        this.service = service;
        System.out.println(letsPlay());
    }

    @Override
    public String letsPlay() {
        return "letsPlay " + service.getName();
    }
}
