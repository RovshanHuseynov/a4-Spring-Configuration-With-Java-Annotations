package com.rh.spring.a4springconfigurationwithjavaannotation.service;

import org.springframework.stereotype.Component;

@Component
public class RugbyService implements Service{
    @Override
    public String getName() {
        return "rugby";
    }
}
