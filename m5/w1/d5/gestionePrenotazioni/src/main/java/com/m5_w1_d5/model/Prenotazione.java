package com.m5_w1_d5.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import com.m5_w1_d5.utils.StatoPrenotazione;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prenotazioni")
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Integer idPrenotazione;

	@Column(nullable = false)
	private Date dataPrenotazione;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatoPrenotazione statoprenotazione = StatoPrenotazione.CONFERMATA;

	@ManyToOne
	@JoinColumn(name = "id_postazione", nullable = false)
	private Postazione postazione;

	@ManyToOne
	@JoinColumn(name = "id_utente", nullable = false)
	private Utente utente;

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public StatoPrenotazione getStatoprenotazione() {
		return statoprenotazione;
	}

	public void setStatoprenotazione(StatoPrenotazione statoprenotazione) {
		this.statoprenotazione = statoprenotazione;
	}

	public Postazione getPostazione() {
		return postazione;
	}

	public void setPostazione(Postazione postazione) {
		this.postazione = postazione;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Integer getIdPrenotazione() {
		return idPrenotazione;
	}

	@Override
	public String toString() {
		return "Prenotazione [idPrenotazione=" + idPrenotazione + ", dataPrenotazione=" + dataPrenotazione
				+ ", statoprenotazione=" + statoprenotazione + ", postazione=" + getPostazione().getIdPostazione()
				+ ", utente=" + getUtente().getIdUtente() + "]";
	}

}
