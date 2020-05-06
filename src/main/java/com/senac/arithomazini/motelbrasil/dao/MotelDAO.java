package com.senac.arithomazini.motelbrasil.dao;

import com.senac.arithomazini.motelbrasil.model.Motel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotelDAO extends JpaRepository<Motel, Integer> {
}
