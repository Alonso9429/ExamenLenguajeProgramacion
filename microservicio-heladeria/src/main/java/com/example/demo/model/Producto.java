package com.example.demo.model;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="productos")
@Getter
@Setter

public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable =false)
	private String nombre;
	@Column(nullable =false)
	private int cantidad;
	@Column(nullable =false)
	private String unidad;
	@Column(nullable =false)
	private String categoria;
	@Column(nullable =false)
	private Timestamp fecha_ingreso;

}
