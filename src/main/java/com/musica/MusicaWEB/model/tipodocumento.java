package com.musica.MusicaWEB.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tipodocumento")

public class tipodocumento {
	@Id
	public String id;
	public String nombre;
	public String descripcion;
	public tipodocumento(String id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
}
