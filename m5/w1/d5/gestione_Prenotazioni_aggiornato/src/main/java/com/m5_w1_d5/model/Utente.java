package com.m5_w1_d5.model;

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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utenti")
@AllArgsConstructor
@NoArgsConstructor
public class Utente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Integer idUtente;

	@Column(nullable = false, unique = true)
	private String usernameUtente;

	@Column(nullable = false)
	private String nomeCompletoUtente;

	@Column(nullable = false, unique = true)
	private String emailUtente;

	@OneToMany(mappedBy = "utente")
	List<Prenotazione> listaPrenotazioni;

	public String getUsernameUtente() {
		return usernameUtente;
	}

	public void setUsernameUtente(String usernameUtente) {
		this.usernameUtente = usernameUtente;
	}

	public String getNomeCompletoUtente() {
		return nomeCompletoUtente;
	}

	public void setNomeCompletoUtente(String nomeCompletoUtente) {
		this.nomeCompletoUtente = nomeCompletoUtente;
	}

	public String getEmailUtente() {
		return emailUtente;
	}

	public void setEmailUtente(String emailUtente) {
		this.emailUtente = emailUtente;
	}

	public List<Prenotazione> getListaPrenotazioni() {
		return listaPrenotazioni;
	}

	public void setListaPrenotazioni(List<Prenotazione> listaPrenotazioni) {
		this.listaPrenotazioni = listaPrenotazioni;
	}

	public Integer getIdUtente() {
		return idUtente;
	}

	@Override
	public String toString() {
		return "Utente [idUtente=" + idUtente + ", usernameUtente=" + usernameUtente + ", nomeCompletoUtente="
				+ nomeCompletoUtente + ", emailUtente=" + emailUtente + "]";
	}

}
