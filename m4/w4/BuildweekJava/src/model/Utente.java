package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "Utente.findAll", query = "SELECT u FROM Utente u")
public class Utente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utente", unique = true)
	private Integer idUtente;

	@Column(name = "nome_utente", nullable = false)
	private String nomeUtente;

	@Column(name = "cognome_utente", nullable = false)
	private String cognomeUtente;

	@Column(name = "data_nascita_utente", nullable = false)
	private Date dataNascitaUtente;

	@Column(name = "codice_fiscale_utente", nullable = false, unique = true)
	private String codiceFiscaleUtente;

	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_tessera", nullable = true)
	private Tessera idTessera;

	public Utente() {
	}

	public Integer getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getCognomeUtente() {
		return cognomeUtente;
	}

	public void setCognomeUtente(String cognomeUtente) {
		this.cognomeUtente = cognomeUtente;
	}

	public Date getDataNascitaUtente() {
		return dataNascitaUtente;
	}

	public void setDataNascitaUtente(Date dataNascitaUtente) {
		this.dataNascitaUtente = dataNascitaUtente;
	}

	public String getCodiceFiscaleUtente() {
		return codiceFiscaleUtente;
	}

	public void setCodiceFiscaleUtente(String codiceFiscaleUtente) {
		this.codiceFiscaleUtente = codiceFiscaleUtente;
	}

	public Tessera getIdTessera() {
		return idTessera;
	}

	public void setIdTessera(Tessera idTessera) {
		this.idTessera = idTessera;
	}

	@Override
	public String toString() {
		return "Utente [idUtente=" + idUtente + ", nomeUtente=" + nomeUtente + ", cognomeUtente=" + cognomeUtente
				+ ", dataNascitaUtente=" + dataNascitaUtente + ", codiceFiscaleUtente=" + codiceFiscaleUtente + "]";
	}

}
