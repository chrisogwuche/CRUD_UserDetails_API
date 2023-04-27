package com.decagon.crud_userdetails_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user_details")
public class UserDetails {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}