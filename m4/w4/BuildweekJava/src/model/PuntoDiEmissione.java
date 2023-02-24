package model;

import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery(name = "PuntoDiEmissione.findAll", query = "SELECT pde FROM PuntoDiEmissione pde")
public abstract class PuntoDiEmissione implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_puntodiemissione", unique = true)
	private Integer idPuntoDiEmissione;

	@Column(name = "nome_puntodiemissione", nullable = false)
	private String nomePuntoDiEmissione;

	@Column(name = "indirizzo_puntodiemissione", nullable = false)
	private String indirizzoPuntoDiEmissione;

	@Column(name = "citta_puntodiemissione", nullable = false)
	private String cittaPuntoDiEmissione;

	@OneToMany(mappedBy = "puntoDiEmissione")
	private List<TitoloDiViaggio> titoliDiViaggio;

	public Integer getIdPuntoDiEmissione() {
		return idPuntoDiEmissione;
	}

	public void setIdPuntoDiEmissione(Integer idPuntoDiEmissione) {
		this.idPuntoDiEmissione = idPuntoDiEmissione;
	}

	public String getNomePuntoDiEmissione() {
		return nomePuntoDiEmissione;
	}

	public void setNomePuntoDiEmissione(String nomePuntoDiEmissione) {
		this.nomePuntoDiEmissione = nomePuntoDiEmissione;
	}

	public String getIndirizzoPuntoDiEmissione() {
		return indirizzoPuntoDiEmissione;
	}

	public void setIndirizzoPuntoDiEmissione(String indirizzoPuntoDiEmissione) {
		this.indirizzoPuntoDiEmissione = indirizzoPuntoDiEmissione;
	}

	public String getCittaPuntoDiEmissione() {
		return cittaPuntoDiEmissione;
	}

	public void setCittaPuntoDiEmissione(String cittaPuntoDiEmissione) {
		this.cittaPuntoDiEmissione = cittaPuntoDiEmissione;
	}

	public List<TitoloDiViaggio> getTitoliDiViaggio() {
		return titoliDiViaggio;
	}

	public void setTitoliDiViaggio(List<TitoloDiViaggio> titoliDiViaggio) {
		this.titoliDiViaggio = titoliDiViaggio;
	}

	@Override
	public String toString() {
		return "PuntoDiEmissione [idPuntoDiEmissione=" + idPuntoDiEmissione + ", nomePuntoDiEmissione="
				+ nomePuntoDiEmissione + ", indirizzoPuntoDiEmissione=" + indirizzoPuntoDiEmissione
				+ ", cittaPuntoDiEmissione=" + cittaPuntoDiEmissione + ", getTitoliDiViaggio()=" + getTitoliDiViaggio()
				+ "]";
	}

}
