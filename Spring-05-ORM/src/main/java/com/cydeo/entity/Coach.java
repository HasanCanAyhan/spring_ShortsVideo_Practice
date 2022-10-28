package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "coaches")
public class Coach extends BaseEntity{

    private String firstName;
    private String lastName;
    private int yearsOfExperience;

    @OneToOne(mappedBy = "coach")
    private Team team;

}
