package com.Ese_m5_w2_d3.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "edifici")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Edificio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String indirizzo;

	@Column(nullable = false)
	private String citta;

	@OneToMany(mappedBy = "edificio")
	List<Postazione> listaPostazioni;

	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + ", citta=" + citta + "]";
	}

}
