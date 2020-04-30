package com.senac.arithomazini.motelbrasil.controller;

import com.senac.arithomazini.motelbrasil.dao.ClienteDAO;
import com.senac.arithomazini.motelbrasil.dao.EnderecoDAO;
import com.senac.arithomazini.motelbrasil.model.Cliente;
import com.senac.arithomazini.motelbrasil.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class IndexController {

    @Autowired
    private ClienteDAO clienteDao;

    @Autowired
    private EnderecoDAO enderecoDAO;

    @GetMapping("/")
    public String indexInicial() {
        Cliente c = new Cliente("Ari", "", Calendar.getInstance().getTime(), "M");
        clienteDao.save(c);

        Endereco e = new Endereco("Avenida Prudente de Morais",
                "Vila Santana",
                "Araraquara",
                "Sao Paulo",
                "SP",
                "14801-170",
                "casa",
                "esquina com a 18");

        enderecoDAO.save(e);

        return "index";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

}