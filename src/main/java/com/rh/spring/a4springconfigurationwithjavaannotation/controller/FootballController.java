package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.FootballService;
import org.springframework.stereotype.Component;

/*
    SetterInjection
 */
@Component
public class FootballController implements Sport{
    private FootballService footballService;

    public FootballController() {
    }

    @Override
    public String letsPlay() {
        return footballService.getName();
    }
}
