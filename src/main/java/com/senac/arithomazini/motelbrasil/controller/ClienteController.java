package com.senac.arithomazini.motelbrasil.controller;

import com.senac.arithomazini.motelbrasil.dao.ClienteDAO;
import com.senac.arithomazini.motelbrasil.model.Cliente;
import com.senac.arithomazini.motelbrasil.model.Motel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
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

    @GetMapping("/cadastroClientes")
    public ModelAndView cadastrarCliente(Cliente cliente){
        ModelAndView mv = new ModelAndView("cadastro_cliente");
        mv.addObject("cliente", cliente);

        return mv;
    }

    @PostMapping("/salvarCliente")
    public String salvarCliente(@ModelAttribute Cliente cliente){
        clienteDAO.save(cliente);
        return "index";
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editar(@PathVariable Integer id){
        Cliente cliente = clienteDAO.findById(id).get();
        ModelAndView mv = new ModelAndView("atualizar_cliente");
        mv.addObject("cliente", cliente);

        return mv;
    }

    @PostMapping("/editarCliente/{id}")
    public ModelAndView atualizar(@ModelAttribute Cliente cliente, @PathVariable Integer id){
        cliente.setId(id);
        clienteDAO.save(cliente);

        List<Cliente> clientes = clienteDAO.findAll();
        ModelAndView mv = new ModelAndView("clientes");
        mv.addObject("clientesCadastrados", clientes);

        return mv;
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id){

        clienteDAO.deleteById(id);

        return "index";
    }
}
