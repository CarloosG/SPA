package com.musica.MusicaWEB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.musica.MusicaWEB.model.cancion;

public interface cancionRepository extends JpaRepository<cancion, String>{

}
