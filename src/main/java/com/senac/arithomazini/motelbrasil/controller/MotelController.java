package com.senac.arithomazini.motelbrasil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MotelController {

    @GetMapping("/moteis")
    public String moteis(){
        return "moteis";
    }

}
