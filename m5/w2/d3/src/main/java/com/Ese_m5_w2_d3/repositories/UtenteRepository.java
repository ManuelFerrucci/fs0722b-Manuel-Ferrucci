package com.Ese_m5_w2_d3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ese_m5_w2_d3.models.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {
	public boolean existsByUsername(String username);
}
