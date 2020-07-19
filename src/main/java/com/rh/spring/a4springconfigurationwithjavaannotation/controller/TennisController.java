package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    Construction Injection
 */
@Component
public class TennisController implements Sport{
    private final Service service;

    // @Qualifier is a nice feature, but it is tricky when used with Constructors.
    // You cannot write @Qualifier directly after @Autowired
    // You can write it in parameter list of constructor
    @Autowired
    public TennisController(@Qualifier("tennisService") Service service) {
        System.out.println("Construction Injection");
        this.service = service;
        System.out.println(letsPlay());
    }

    @Override
    public String letsPlay() {
        return "letsPlay " + service.getName();
    }
}
