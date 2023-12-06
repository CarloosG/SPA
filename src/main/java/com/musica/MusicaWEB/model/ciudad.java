package com.musica.MusicaWEB.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="ciudad")

public class ciudad {
	@Id
	public String id;
	public String nombre;
	public String descripcion;
	public ciudad(String id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
}
