package com.adil.entity;

import com.adil.enums.MovieState;
import com.adil.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie<StateType> extends BaseEntity{
    private String name;
    @Column(columnDefinition = "Date")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "text")
    private String summary;
    @Enumerated(EnumType.STRING)
    private MovieType type;
    @Enumerated(EnumType.STRING)
    private MovieState state;
    private BigDecimal price;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name="genre_id"))
    private List<Genre> genreList;
}
