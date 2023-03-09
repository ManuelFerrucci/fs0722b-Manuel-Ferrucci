package com.Ese_m5_w2_d3.models;

import java.io.Serializable;
import java.util.List;

import com.Ese_m5_w2_d3.utils.TipoPostazione;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "postazioni")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Postazione implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Integer id;

	@Column(nullable = false)
	private String descrizione;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoPostazione tipoPostazione;

	@Column(nullable = false)
	private Integer massimoPartecipanti;

	@OneToOne
	@JoinColumn(name = "id_edificio", nullable = false)
	private Edificio edificio;

	@OneToMany(mappedBy = "postazione")
	List<Prenotazione> listaPrenotazioni;

	@Override
	public String toString() {
		return "Postazione [id=" + id + ", descrizione=" + descrizione + ", tipoPostazione=" + tipoPostazione
				+ ", massimoPartecipanti=" + massimoPartecipanti + ", nomeEdificio=" + getEdificio().getNome() + "]";
	}

}
