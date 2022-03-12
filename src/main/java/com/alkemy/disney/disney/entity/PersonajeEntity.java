package com.alkemy.disney.disney.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String nombre;

    private Long edad;

    private Long peso;

    private String historia;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private Set<PeliculaEntity> peliculas = new HashSet<>();

    public void addPelicula(PeliculaEntity pelicula) {
        this.peliculas.add(pelicula);
    }

    public void removePelicula(PeliculaEntity pelicula) {
        this.peliculas.remove(pelicula);
    }

}