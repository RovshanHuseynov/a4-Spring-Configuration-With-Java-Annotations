package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.BasketballService;
import org.springframework.stereotype.Component;

/*
    FieldInjection
 */
@Component
public class BasketballController implements Sport{
    private BasketballService basketballService;

    public BasketballController() {
    }

    @Override
    public String letsPlay() {
        return basketballService.getName();
    }
}
