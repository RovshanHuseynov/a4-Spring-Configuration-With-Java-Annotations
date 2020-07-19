package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import org.springframework.stereotype.Component;

/*
    FieldInjection
 */
@Component
public class BasketballController implements Sport{
    @Override
    public String letsPlay() {
        return "Basketball";
    }
}
