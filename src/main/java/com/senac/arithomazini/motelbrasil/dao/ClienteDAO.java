package com.senac.arithomazini.motelbrasil.dao;

import com.senac.arithomazini.motelbrasil.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
}
