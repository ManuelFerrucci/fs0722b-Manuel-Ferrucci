package com.Spring_w2_d1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class PaginaController {

	@GetMapping("/home")
	public String showHome() {
		return "home";
	}

	@PostMapping("/home/{scelta}")
	public String languageChoice(@PathVariable String scelta) {
		if (showHome().equalsIgnoreCase("italiano")) {
			try {
				return "italiano";
			} catch (Exception e) {
				e.getMessage();
			}
		} else if (showHome().equalsIgnoreCase("inglese")) {
			try {
				return "inglese";
			} catch (Exception e) {
				e.getMessage();
			}
		} else {
			return "pagina_errore";
		}
		return null;
	}
}
