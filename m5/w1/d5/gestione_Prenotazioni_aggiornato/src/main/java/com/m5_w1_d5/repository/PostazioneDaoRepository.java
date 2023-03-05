package com.m5_w1_d5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m5_w1_d5.model.Postazione;
import com.m5_w1_d5.utils.TipoPostazione;

@Repository
public interface PostazioneDaoRepository extends JpaRepository<Postazione, Integer> {
	List<Postazione> findByTipoPostazione(TipoPostazione tipoPostazione);
	List<Postazione> findPostazioniByTipoPostazioneAndEdificioCittaEdificio(TipoPostazione tipoPostazione, String citta);
}
