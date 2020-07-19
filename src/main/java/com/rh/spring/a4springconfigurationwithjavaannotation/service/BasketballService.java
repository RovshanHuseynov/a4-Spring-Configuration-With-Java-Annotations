package com.rh.spring.a4springconfigurationwithjavaannotation.service;

import org.springframework.stereotype.Component;

@Component
public class BasketballService implements Service{
    public String getName(){
        return "basketball";
    }
}
