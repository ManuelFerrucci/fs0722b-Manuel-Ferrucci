package com.Ese_1_secretCode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ese_1_secretCode.models.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {

}
