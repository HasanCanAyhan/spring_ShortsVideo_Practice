package com.cydeo.entity;


import com.cydeo.enums.Country;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "teams")
public class Team extends BaseEntity{

    @Column(name = "teamName")
    private String name;
    @Enumerated(EnumType.STRING)
    private Country country;
    @Transient
    private String founder;

    @OneToOne
    private Coach coach;

    @OneToMany(mappedBy = "team")
    private List<Player> player;

}
