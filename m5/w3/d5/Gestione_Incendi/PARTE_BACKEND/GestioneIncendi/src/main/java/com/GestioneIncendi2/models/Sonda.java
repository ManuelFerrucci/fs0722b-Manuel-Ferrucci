package com.GestioneIncendi2.models;

import java.util.Random;

import com.GestioneIncendi2.utils.StatoAllarmeSonda;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sonde")
@NoArgsConstructor
@Getter
@Setter
public class Sonda implements Installazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private Double latitudine;

	@Column(nullable = false)
	private Double longitudine;

	@Column(nullable = false)
	private Integer quantitaFumo;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatoAllarmeSonda allarmeIncendio;

	public Sonda(Integer id, Double latitudine, Double longitudine, Integer quantitaFumo,
			StatoAllarmeSonda allarmeIncendio) {
		Random random = new Random();
		this.id = id;
		this.latitudine = random.nextDouble(-90, 90);
		this.longitudine = random.nextDouble(-90, 90);
		this.quantitaFumo = random.nextInt(0, 11);
		this.allarmeIncendio = allarmeIncendio;
		if (this.quantitaFumo > 5) {
			this.allarmeIncendio = StatoAllarmeSonda.Attivo;
		} else {
			this.allarmeIncendio = StatoAllarmeSonda.Disattivo;
		}
	}

	// Questo costruttore "non random" mi è più comodo per il test di JUnit
	public Sonda(Integer id, Double latitudine, Double longitudine, Integer quantitaFumo) {
		super();
		this.id = id;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.quantitaFumo = quantitaFumo;
		if (this.quantitaFumo > 5) {
			this.allarmeIncendio = StatoAllarmeSonda.Attivo;
		} else {
			this.allarmeIncendio = StatoAllarmeSonda.Disattivo;
		}
	}

	@Override
	public void installa() {
		System.out.println();
	}

	@Override
	public String toString() {
		return "Sonda" + id + " [id=" + id + ", latitudine=" + latitudine + ", longitudine=" + longitudine
				+ ", quantitaFumo=" + quantitaFumo + ", allarmeIncendio=" + allarmeIncendio + "]";
	}

}
