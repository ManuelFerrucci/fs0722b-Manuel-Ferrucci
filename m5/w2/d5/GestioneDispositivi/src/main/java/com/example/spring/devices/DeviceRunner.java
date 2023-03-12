package com.example.spring.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.spring.security.auth.users.User;
import com.example.spring.security.auth.users.UserRepository;

@Component
public class DeviceRunner implements ApplicationRunner {

	@Autowired
	DeviceRepository deviceRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

//		User richiamo1 = userRepository.findById(1l).get();
//		User richiamo2 = userRepository.findById(2l).get();
//		User richiamo3 = userRepository.findById(3l).get();

//		Device macBookAir = new Device();
//		macBookAir.setNome("MacBook-Air ultimo modello");
//		macBookAir.setTipo(TipoDevice.LAPTOP);
//		macBookAir.setStato(StatoDevice.ASSEGNATO);
//		macBookAir.setUser(richiamo1);
//		deviceRepository.save(macBookAir);

//		Device iPhone14 = new Device();
//		iPhone14.setNome("iPhone 14");
//		iPhone14.setTipo(TipoDevice.SMARTPHONE);
//		iPhone14.setStato(StatoDevice.ASSEGNATO);
//		iPhone14.setUser(richiamo1);
//		deviceRepository.save(iPhone14);

//		Device iPad = new Device();
//		iPad.setNome("iPad ultimo modello");
//		iPad.setTipo(TipoDevice.TABLET);
//		iPad.setStato(StatoDevice.ASSEGNATO);
//		iPad.setUser(richiamo3);
//		deviceRepository.save(iPad);

//		Device iPhone11 = new Device();
//		iPhone11.setNome("iPhone 11");
//		iPhone11.setTipo(TipoDevice.SMARTPHONE);
//		iPhone11.setStato(StatoDevice.DISPONIBILE);
//		deviceRepository.save(iPhone11);

	}

}
