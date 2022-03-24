package com.adil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Mentor {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String batch;
    private String company;
    private boolean graduated;
}
