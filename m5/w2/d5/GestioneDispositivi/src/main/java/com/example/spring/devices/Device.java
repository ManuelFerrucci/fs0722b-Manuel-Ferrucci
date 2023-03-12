package com.example.spring.devices;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.spring.security.auth.users.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "be_service_devices")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoDevice tipo;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatoDevice stato;

	@ManyToOne
	@JoinColumn(name = "id_user", nullable = true)
	private User user;

}
