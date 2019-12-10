package com.pinnacle.pinnacleapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "league")
@NoArgsConstructor
@Getter
@Setter
public class League {
    @Id    
    int id;
    String name;
    String homeTeamType ;
    String hasOfferings;
    String container ;
    String allowRoundRobins;
    int leagueSpecialsCount;
    int eventSpecialsCount;
    String eventCount;
}
