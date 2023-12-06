package com.musica.MusicaWEB.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Persona")

public class Persona {
	@Id
	public String id;
	public String nombre;
	public String apellidos;
	public int documento;
	public String lugarResidencia;
	public String email;
	public int telefono;
	public String usuario;
	private String password;
	@ManyToOne
	@JoinColumn(name="id_tipoDocumetn")
	public tipodocumento Tipodocumento;
	@ManyToOne
	@JoinColumn(name="id_ciudad")
	public ciudad Ciudad;

	public Persona(String id, String nombre, String apellidos, int documento, String lugarResidencia, String email,
			int telefono, String usuario, String password, tipodocumento tipodocumento, ciudad ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.documento = documento;
		this.lugarResidencia = lugarResidencia;
		this.email = email;
		this.telefono = telefono;
		this.usuario = usuario;
		this.password = password;
		Tipodocumento = tipodocumento;
		Ciudad = ciudad;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
