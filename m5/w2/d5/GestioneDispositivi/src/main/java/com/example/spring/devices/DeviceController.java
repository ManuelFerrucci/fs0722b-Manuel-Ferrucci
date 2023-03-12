package com.example.spring.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.security.auth.users.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/devices")
public class DeviceController {

	@Autowired
	DeviceRepository deviceRepository;

	@Autowired
	UserRepository userRepository;

	@GetMapping
	@PreAuthorize("hasRole('ADMIN')")
	public Page<Device> deviceList(Pageable pageable) {
		Page<Device> findAll = deviceRepository.findAll(pageable);
		return findAll;
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Device> creaDevice(@RequestBody Device device) {
		if (device.getUser() == null || userRepository.existsByUsername(device.getUser().getUsername())) {
			Device d = deviceRepository.save(device);
			return new ResponseEntity<Device>(d, HttpStatus.OK);
		}
		return null;
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Device> modificaDevice(@RequestBody Device device) {
		if (device.getUser() == null || userRepository.existsByUsername(device.getUser().getUsername())) {
			Device d = deviceRepository.save(device);
			return new ResponseEntity<Device>(d, HttpStatus.OK);
		}
		return null;
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> eliminaDevice(@PathVariable Long id) {
		Device x = deviceRepository.findById(id).get();
		if (x != null) {
			deviceRepository.delete(x);
			return new ResponseEntity<String>("Device eliminato!", HttpStatus.OK);
		}
		return null;
	}
}
