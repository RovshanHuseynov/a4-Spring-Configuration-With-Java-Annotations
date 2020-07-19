package com.rh.spring.a4springconfigurationwithjavaannotation.controller;

import com.rh.spring.a4springconfigurationwithjavaannotation.service.TennisService;
import org.springframework.stereotype.Component;

/*
    ConstructionInjection
 */
@Component
public class TennisController implements Sport{
    private TennisService tennisService;

    public TennisController(TennisService tennisService) {
        this.tennisService = tennisService;
    }

    @Override
    public String letsPlay() {
        return "Tennis";
    }
}
