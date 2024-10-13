package com.example.demo.model;

import jakarta.persistence.*;


import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "usuarios")
@Getter
@Setter

public class Usuario {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	@Column(nullable =false)
	private String nombre;
	@Column(nullable =false)
	private String apellido;
	@Column(nullable =false)
	private String cargo;
	@Column(nullable =false)
	private String usuario;
	@Column(nullable =false)
	private String contraseña;

}
