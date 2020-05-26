package com.senac.arithomazini.motelbrasil.controller;

import com.senac.arithomazini.motelbrasil.dao.EnderecoDAO;
import com.senac.arithomazini.motelbrasil.dao.MotelDAO;
import com.senac.arithomazini.motelbrasil.model.Motel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        List<Motel> moteis = motelDAO.findAll();

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

    @PostMapping("/atualizarMotel/{id}")
    public String update(@ModelAttribute Motel motel, @PathVariable("id") Integer id){
        enderecoDAO.save(motel.getEndereco());
        motelDAO.save(motel);
        return "index";
    }

    @GetMapping("/editarMotel/{id}")
    public ModelAndView atualizarMotel(@PathVariable("id") Integer id, Motel motel){
        motel = motelDAO.findById(id).get();

        ModelAndView mv = new ModelAndView("atualizar_motel");
        mv.addObject("motel", motel);

        return mv;
    }

    @GetMapping("/excluirMotel/{id}")
    public ModelAndView exluir(@PathVariable("id") Integer id, Motel motel){
        motelDAO.deleteById(id);

        List<Motel> moteis = motelDAO.findAll();

        ModelAndView mv = new ModelAndView("moteis");
        mv.addObject("moteisCadastrados", moteis);

        return mv;
    }
}
