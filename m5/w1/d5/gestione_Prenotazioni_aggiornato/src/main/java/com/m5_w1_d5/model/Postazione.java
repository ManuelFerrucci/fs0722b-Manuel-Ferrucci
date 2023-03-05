package com.m5_w1_d5.model;

import java.io.Serializable;
import java.util.List;

import com.m5_w1_d5.utils.StatoPostazione;
import com.m5_w1_d5.utils.TipoPostazione;

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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazioni")
@AllArgsConstructor
@NoArgsConstructor
public class Postazione implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Integer idPostazione;

	@Column(nullable = false)
	private String descrizionePostazione;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoPostazione tipoPostazione;

	@Column(nullable = false)
	private Integer massimoPartecipantiPostazione;

	@OneToOne
	@JoinColumn(name = "id_edificio", nullable = false)
	private Edificio edificio;

	@OneToMany(mappedBy = "postazione")
	List<Prenotazione> listaPrenotazioni;

	public String getDescrizionePostazione() {
		return descrizionePostazione;
	}

	public void setDescrizionePostazione(String descrizionePostazione) {
		this.descrizionePostazione = descrizionePostazione;
	}

	public TipoPostazione getTipoPostazione() {
		return tipoPostazione;
	}

	public void setTipoPostazione(TipoPostazione tipoPostazione) {
		this.tipoPostazione = tipoPostazione;
	}

	public Integer getMassimoPartecipantiPostazione() {
		return massimoPartecipantiPostazione;
	}

	public void setMassimoPartecipantiPostazione(Integer massimoPartecipantiPostazione) {
		this.massimoPartecipantiPostazione = massimoPartecipantiPostazione;
	}

	public Edificio getIdEdificio() {
		return edificio;
	}

	public void setIdEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	public List<Prenotazione> getListaPrenotazioni() {
		return listaPrenotazioni;
	}

	public void setListaPrenotazioni(List<Prenotazione> listaPrenotazioni) {
		this.listaPrenotazioni = listaPrenotazioni;
	}

	public Integer getIdPostazione() {
		return idPostazione;
	}

	@Override
	public String toString() {
		return "Postazione [idPostazione=" + idPostazione + ", descrizionePostazione=" + descrizionePostazione
				+ ", tipoPostazione=" + tipoPostazione + ", massimoPartecipantiPostazione="
				+ massimoPartecipantiPostazione + ", edificio=" + getIdEdificio().getNomeEdificio() + "]";
	}

}
