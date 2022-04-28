package com.adil.entity;

import com.adil.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "account_details")
public class Account extends BaseEntity {
    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private int age;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @OneToOne(mappedBy="account", fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private User user;


}
