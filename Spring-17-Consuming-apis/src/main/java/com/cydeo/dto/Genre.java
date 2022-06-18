package com.cydeo.dto;

import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.Movie;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@NoArgsConstructor
public class Genre extends BaseEntity {

    private String name;

    private List<Movie> movieList;

}
