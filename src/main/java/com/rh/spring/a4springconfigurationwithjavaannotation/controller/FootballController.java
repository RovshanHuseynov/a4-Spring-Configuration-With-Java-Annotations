package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import org.springframework.stereotype.Component;

/*
    SetterInjection
 */
@Component
public class FootballController implements Sport{
    @Override
    public String letsPlay() {
        return "Football";
    }
}
