package com.senac.arithomazini.motelbrasil.controller;

import com.senac.arithomazini.motelbrasil.dao.EnderecoDAO;
import com.senac.arithomazini.motelbrasil.dao.MotelDAO;
import com.senac.arithomazini.motelbrasil.model.Motel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MotelController {

    @Autowired
    private MotelDAO motelDAO;

    @Autowired
    private EnderecoDAO enderecoDAO;

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

    @GetMapping("/cadastroMoteis")
    public ModelAndView cadastrarMotel(Motel motel){
        ModelAndView mv = new ModelAndView("cadastro_motel");
        mv.addObject("motel", motel);

        return mv;
    }

    @PostMapping("/salvarMotel")
    public String salvarMotel(@ModelAttribute Motel motel){
        enderecoDAO.save(motel.getEndereco());
        motelDAO.save(motel);
        return "index";
    }

}
