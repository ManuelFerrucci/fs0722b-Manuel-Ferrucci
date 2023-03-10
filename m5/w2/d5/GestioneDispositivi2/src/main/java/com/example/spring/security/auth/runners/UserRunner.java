package com.example.spring.security.auth.runners;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.spring.security.auth.roles.ERole;
import com.example.spring.security.auth.roles.Role;
import com.example.spring.security.auth.roles.RoleRepository;
import com.example.spring.security.auth.users.User;
import com.example.spring.security.auth.users.UserRepository;

@Component
public class UserRunner implements ApplicationRunner {

	@Autowired
	RoleRepository roleRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder encoder;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Role amministratore = new Role();
		amministratore.setRoleName(ERole.AMMINISTRATORE);
		// roleRepository.save(amministratore);

		Role dipendente = new Role();
		dipendente.setRoleName(ERole.DIPENDENTE);
		// roleRepository.save(dipendente);

		Set<Role> amministratoreRuolo = new HashSet<Role>();
		amministratoreRuolo.add(amministratore);
		amministratoreRuolo.add(dipendente);

		Set<Role> dipendenteRuolo = new HashSet<Role>();
		dipendenteRuolo.add(dipendente);

		User amministratore1 = new User();
		amministratore1.setNome("Manuel");
		amministratore1.setCognome("Ferrucci");
		amministratore1.setUsername("manufer");
		amministratore1.setEmail("manufer@example.com");
		amministratore1.setPassword(encoder.encode("12345"));
		amministratore1.setRoles(amministratoreRuolo);
		// userRepository.save(amministratore1);

		User dipendente1 = new User();
		dipendente1.setNome("Stefano");
		dipendente1.setCognome("Gavioli");
		dipendente1.setUsername("stefgav");
		dipendente1.setEmail("stefgav@example.com");
		dipendente1.setPassword(encoder.encode("12345"));
		dipendente1.setRoles(dipendenteRuolo);
		// userRepository.save(dipendente1);
	}

}
