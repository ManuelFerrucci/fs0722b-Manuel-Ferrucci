package com.Ese_2_microservizi2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ese_2_microservizi2.models.Utente;
import com.Ese_2_microservizi2.repositories.UtenteRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UtenteController {
	@Autowired
	UtenteRepository utenteRepository;

	@GetMapping("/lista")
	public ResponseEntity<Page<Utente>> listaUtenti(Pageable pageable) {
		Page<Utente> lista = utenteRepository.findAll(pageable);
		return ResponseEntity.ok(lista);
	}
}
