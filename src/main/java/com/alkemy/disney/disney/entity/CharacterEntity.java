package com.alkemy.disney.disney.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "character")
@Getter
@Setter
public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String name;

    private Long age;

    private Long weight;

    private String history;

    @ManyToMany(mappedBy = "characters")
    private Set<MovieEntity> movies = new HashSet<>();

    /*public void addPelicula(MovieEntity pelicula) {
        this.peliculas.add(pelicula);
    }

    public void removePelicula(MovieEntity pelicula) {
        this.peliculas.remove(pelicula);
    }*/

}