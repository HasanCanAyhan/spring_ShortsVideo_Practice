package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "players")
public class Player extends BaseEntity{

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    @ManyToOne
    private Team team;
}
