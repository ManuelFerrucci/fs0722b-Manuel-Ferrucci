package com.Ese_m5_w2_d3.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prenotazioni")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Prenotazione implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Integer id;

	@Column(nullable = false)
	private Date data;

	@ManyToOne
	@JoinColumn(name = "id_postazione", nullable = false)
	private Postazione postazione;

	@ManyToOne
	@JoinColumn(name = "id_utente", nullable = false)
	private Utente utente;

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", data=" + data + ", postazione=" + getPostazione().getId() + ", utente="
				+ getUtente().getId() + "]";
	}

}
