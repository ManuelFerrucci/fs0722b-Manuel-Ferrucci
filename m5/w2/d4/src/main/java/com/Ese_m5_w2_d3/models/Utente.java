package com.Ese_m5_w2_d3.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "utenti")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Utente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Integer id;

	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String nomeCompleto;

	@Column(nullable = false, unique = true)
	private String email;

	@OneToMany(mappedBy = "utente")
	List<Prenotazione> listaPrenotazioni;

	@Override
	public String toString() {
		return "Utente [id=" + id + ", username=" + username + ", nomeCompleto=" + nomeCompleto + ", email=" + email
				+ "]";
	}

}
