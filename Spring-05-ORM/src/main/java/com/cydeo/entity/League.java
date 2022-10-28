package com.cydeo.entity;

import com.cydeo.enums.Level;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "leagues")
public class League extends BaseEntity{
    
    @Column(name = "leagueName")
    private String name;
    
    @Enumerated(EnumType.STRING)
    private Level level;
    
    private boolean isNational;
    
}
