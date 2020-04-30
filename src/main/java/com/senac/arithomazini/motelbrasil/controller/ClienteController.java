package com.senac.arithomazini.motelbrasil.controller;

import com.senac.arithomazini.motelbrasil.dao.ClienteDAO;
import com.senac.arithomazini.motelbrasil.model.Cliente;
import com.senac.arithomazini.motelbrasil.model.Motel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    private ClienteDAO clienteDAO;

    @GetMapping("/clientes")
    public ModelAndView clientes(){
        List<Cliente> clientes = clienteDAO.findAll();

        ModelAndView mv = new ModelAndView("clientes");
        mv.addObject("clientesCadastrados", clientes);

        return mv;
    }

}
