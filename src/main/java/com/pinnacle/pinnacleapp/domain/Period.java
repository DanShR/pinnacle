package com.pinnacle.pinnacleapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "period")
@NoArgsConstructor
@Getter
@Setter
public class Period {
    @Id
    int number;
    String description;
    String shortDescription;
    String spreadDescription;
    String moneylineDescription;
    String totalDescription;
    String team1TotalDescription;
    String team2TotalDescription;
    String spreadShortDescription;
    String moneylineShortDescription;
    String totalShortDescription;
    String team1TotalShortDescription;
    String team2TotalShortDescription;
}
