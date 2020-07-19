package com.rh.spring.a4springconfigurationwithjavaannotation.service;

import org.springframework.stereotype.Component;

@Component
public class FootballService implements Service{
    @Override
    public String getName(){
        return "football";
    }
}
