package com.Ese_2_microservizi2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ese_2_microservizi2.models.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {

}
