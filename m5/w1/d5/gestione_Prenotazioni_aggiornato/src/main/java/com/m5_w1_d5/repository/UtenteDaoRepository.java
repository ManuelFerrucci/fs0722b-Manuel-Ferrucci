package com.m5_w1_d5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m5_w1_d5.model.Utente;

@Repository
public interface UtenteDaoRepository extends JpaRepository<Utente, Integer> {
	
}
