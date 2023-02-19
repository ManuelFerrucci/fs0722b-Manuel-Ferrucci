package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@NamedQuery(name = "Utente.findAll", query = "SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tessera_utente", unique = true)
	private Integer idTesseraUtente;

	@Column(name = "nome_utente", nullable = false)
	private String nomeUtente;

	@Column(name = "cognome_utente", nullable = false)
	private String cognomeUtente;

	@Column(name = "data_nascita_utente", nullable = false)
	private Date dataNascitaUtente;

	@OneToMany(mappedBy = "utente", cascade = CascadeType.REMOVE)
	private List<Prestiti> listaPrestiti;

	public Utente() {
	}

	public Integer getIdTesseraUtente() {
		return idTesseraUtente;
	}

	public void setIdTesseraUtente(Integer idTesseraUtente) {
		this.idTesseraUtente = idTesseraUtente;
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

	public List<Prestiti> getListaPrestiti() {
		return listaPrestiti;
	}

	public void setListaPrestiti(List<Prestiti> listaPrestiti) {
		this.listaPrestiti = listaPrestiti;
	}

	@Override
	public String toString() {
		return "Utente [idTesseraUtente=" + idTesseraUtente + ", nomeUtente=" + nomeUtente + ", cognomeUtente="
				+ cognomeUtente + ", dataNascitaUtente=" + dataNascitaUtente + ", listaPrestiti=" + listaPrestiti + "]";
	}
}