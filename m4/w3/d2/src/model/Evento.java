package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventi")
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;

	public Evento() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column(name = "id_utente") se vogliamo cambiare il nome dell'id qui su java
	private int id;

	@Column(nullable = false)
	private String titolo;

	@Column(nullable = false)
	private String data_evento;

	@Column(nullable = false)
	private String tipo_evento;

	@Column(nullable = false)
	private int numero_massimo_partecipanti;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getData_evento() {
		return data_evento;
	}

	public void setData_evento(String data_evento) {
		this.data_evento = data_evento;
	}

	public String getTipo_evento() {
		return tipo_evento;
	}

	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}

	public int getNumero_massimo_partecipanti() {
		return numero_massimo_partecipanti;
	}

	public void setNumero_massimo_partecipanti(int numero_massimo_partecipanti) {
		this.numero_massimo_partecipanti = numero_massimo_partecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", data_evento=" + data_evento + ", tipo_evento="
				+ tipo_evento + ", numero_massimo_partecipanti=" + numero_massimo_partecipanti + "]";
	}

}
