package com.herpderp9000.guildapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dmelia on 27/11/2019
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@Entity
@Table(name = "profiles", uniqueConstraints = {@UniqueConstraint(columnNames = "username"), @UniqueConstraint(columnNames = "id")})
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "age_visible")
    private Boolean ageVisible;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "name_visible")
    private Boolean nameVisible;

    @Column(name = "description")
    private String description;

    @Column(name = "contact")
    private String contact;
}
