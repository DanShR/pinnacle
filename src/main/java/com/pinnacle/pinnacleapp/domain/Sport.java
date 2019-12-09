package com.pinnacle.pinnacleapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sport")
@NoArgsConstructor
public class Sport {
    @Id
    @Getter
    @Setter
    int id;

    @Getter
    @Setter
    @Column(name = "name")
    String name;

}
