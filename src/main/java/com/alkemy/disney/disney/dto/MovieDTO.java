package com.alkemy.disney.disney.dto;

import com.alkemy.disney.disney.entity.CharacterEntity;
import com.alkemy.disney.disney.entity.GenreEntity;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class MovieDTO {
    private Long id;
    private String image;
    private String title;
    private LocalDate creationDate;
    private int rating;
    private GenreEntity genre;  //   ??? ver si va
    private Long genreId;
    private Set<CharacterEntity> characters;
}
