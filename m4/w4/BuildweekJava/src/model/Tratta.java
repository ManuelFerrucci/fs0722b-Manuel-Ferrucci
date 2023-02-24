package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "Tratta.findAll", query = "SELECT trat FROM Tratta trat")
public class Tratta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tratta", unique = true)
	private Integer idTratta;

	@Column(name = "luogo_partenza_tratta", nullable = false)
	private String luogoPartenzaTratta;

	@Column(name = "luogo_capolinea_tratta", nullable = false)
	private String luogoCapolineaTratta;

	@Column(name = "ora_inizio_tratta", nullable = false)
	private Date oraInizioTratta;

	@Column(name = "ora_fine_tratta", nullable = false)
	private Date oraFineTratta;

	@Column(name = "tempo_medio_tratta", nullable = false)
	private Date tempoMedioTratta;

	@OneToOne
	@JoinColumn(name = "id_viaggio", nullable = true)
	private Viaggio viaggio;

	public Tratta() {
		super();
	}

	public Integer getIdTratta() {
		return idTratta;
	}

	public void setIdTratta(Integer idTratta) {
		this.idTratta = idTratta;
	}

	public String getLuogoPartenzaTratta() {
		return luogoPartenzaTratta;
	}

	public void setLuogoPartenzaTratta(String luogoPartenzaTratta) {
		this.luogoPartenzaTratta = luogoPartenzaTratta;
	}

	public String getLuogoCapolineaTratta() {
		return luogoCapolineaTratta;
	}

	public void setLuogoCapolineaTratta(String luogoCapolineaTratta) {
		this.luogoCapolineaTratta = luogoCapolineaTratta;
	}

	public Date getOraInizioTratta() {
		return oraInizioTratta;
	}

	public void setOraInizioTratta(Date oraInizioTratta) {
		this.oraInizioTratta = oraInizioTratta;
	}

	public Date getOraFineTratta() {
		return oraFineTratta;
	}

	public void setOraFineTratta(Date oraFineTratta) {
		this.oraFineTratta = oraFineTratta;
	}

	public Date getTempoMedioTratta() {
		return tempoMedioTratta;
	}

	public void setTempoMedioTratta(Date tempoMedioTratta) {
		this.tempoMedioTratta = tempoMedioTratta;
	}

	@Override
	public String toString() {
		return "Tratta [idTratta=" + idTratta + ", luogoPartenzaTratta=" + luogoPartenzaTratta
				+ ", luogoCapolineaTratta=" + luogoCapolineaTratta + ", oraInizioTratta=" + oraInizioTratta
				+ ", oraFineTratta=" + oraFineTratta + ", tempoMedioTratta=" + tempoMedioTratta + "]";
	}

}
