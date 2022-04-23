package com.adil.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "account_details")
public class Account extends BaseEntity{
    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private int age;


}
