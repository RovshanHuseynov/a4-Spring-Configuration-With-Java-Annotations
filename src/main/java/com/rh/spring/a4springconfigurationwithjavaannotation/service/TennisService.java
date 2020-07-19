package com.rh.spring.a4springconfigurationwithjavaannotation.service;

import org.springframework.stereotype.Component;

@Component
public class TennisService implements Service{
    @Override
    public String getName(){
        return "tennis";
    }
}
