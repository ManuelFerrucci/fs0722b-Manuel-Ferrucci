package com.Ese_m5_w2_d3.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ese_m5_w2_d3.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	@Autowired
	PrenotazioneRepository prenotazioneRepo;

}
