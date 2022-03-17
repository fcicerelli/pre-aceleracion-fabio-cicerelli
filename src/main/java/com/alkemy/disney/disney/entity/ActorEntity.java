package com.alkemy.disney.disney.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "actor")
@Getter
@Setter
public class ActorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String name;

    private Long age;

    private Long weight;

    private String history;

    @ManyToMany(mappedBy = "actors")
    private Set<MovieEntity> movie = new HashSet<>();



}