package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the utente database table.
 * 
 */
@Entity
@NamedQuery(name = "Utente.findAll", query = "SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tessera_utente")
	private Integer idTesseraUtente;

	@Column(name = "cognome_utente")
	private String cognomeUtente;

	@Column(name = "data_nascita_utente")
	private String dataNascitaUtente;

	@Column(name = "nome_utente")
	private String nomeUtente;

	// bi-directional many-to-one association to Prestiti
	@OneToMany(mappedBy = "utente")
	private List<Prestiti> prestitis;

	public Utente() {
	}

	public Integer getIdTesseraUtente() {
		return this.idTesseraUtente;
	}

	public void setIdTesseraUtente(Integer idTesseraUtente) {
		this.idTesseraUtente = idTesseraUtente;
	}

	public String getCognomeUtente() {
		return this.cognomeUtente;
	}

	public void setCognomeUtente(String cognomeUtente) {
		this.cognomeUtente = cognomeUtente;
	}

	public String getDataNascitaUtente() {
		return this.dataNascitaUtente;
	}

	public void setDataNascitaUtente(String dataNascitaUtente) {
		this.dataNascitaUtente = dataNascitaUtente;
	}

	public String getNomeUtente() {
		return this.nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public List<Prestiti> getPrestitis() {
		return this.prestitis;
	}

	public void setPrestitis(List<Prestiti> prestitis) {
		this.prestitis = prestitis;
	}

	public Prestiti addPrestiti(Prestiti prestiti) {
		getPrestitis().add(prestiti);
		prestiti.setUtente(this);

		return prestiti;
	}

	public Prestiti removePrestiti(Prestiti prestiti) {
		getPrestitis().remove(prestiti);
		prestiti.setUtente(null);

		return prestiti;
	}

	@Override
	public String toString() {
		return "Utente [idTesseraUtente=" + idTesseraUtente + ", cognomeUtente=" + cognomeUtente
				+ ", dataNascitaUtente=" + dataNascitaUtente + ", nomeUtente=" + nomeUtente + ", prestitis=" + prestitis
				+ "]";
	}

}