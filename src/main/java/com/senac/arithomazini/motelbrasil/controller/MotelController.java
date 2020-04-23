package com.senac.arithomazini.motelbrasil.controller;

import com.senac.arithomazini.motelbrasil.model.Motel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MotelController {

    @GetMapping("/moteis")
    public ModelAndView moteis(){
        List<Motel> moteis = new ArrayList<>();

        Motel casaDoPrazer = new Motel("Casa Do Prazer", "Seu prazer, nosso lucro");
        Motel ishi = new Motel("Ishi", "ahsuah");

        moteis.add(casaDoPrazer);
        moteis.add(ishi);

        ModelAndView mv = new ModelAndView("moteis");
        mv.addObject("moteisCadastrados", moteis);

        return mv;
    }

}
