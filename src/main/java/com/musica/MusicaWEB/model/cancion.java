package com.musica.MusicaWEB.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cancion")

public class cancion {
	@Id
	public String nombreCancion;
	public String artista;
	public String año;
	public String album;
	public String calificacion;
	public cancion(String nombreCancion, String artista, String año, String album, String calificacion) {
		super();
		this.nombreCancion = nombreCancion;
		this.artista = artista;
		this.año = año;
		this.album = album;
		this.calificacion = calificacion;
	}
	
	
}
