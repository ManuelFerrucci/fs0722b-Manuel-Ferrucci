package com.Ese_1_secretCode.models;

import com.Ese_1_secretCode.configurations.ConverterCode;
import com.Ese_1_secretCode.utils.StatoCodiceSicurezzaEdificio;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "edifici")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String indirizzo;

	@Column(nullable = false)
	private String citta;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatoCodiceSicurezzaEdificio statoCodice = StatoCodiceSicurezzaEdificio.BLOCCATO;

	@Convert(converter = ConverterCode.class)
	@Column(nullable = true)
	private String codiceDiSbloccoInserito;

	@Convert(converter = ConverterCode.class)
	@Column(nullable = false)
	private String codiceSicurezza;

	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + ", citta=" + citta
				+ ", statoCodice=" + statoCodice + ", codiceDiSbloccoInserito=" + codiceDiSbloccoInserito
				+ ", codiceSicurezza=" + codiceSicurezza + "]";
	}

}
