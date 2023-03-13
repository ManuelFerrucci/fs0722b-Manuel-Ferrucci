package com.Ese_1_secretCode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ese_1_secretCode.models.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {

}
