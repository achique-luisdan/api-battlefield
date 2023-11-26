package com.boardgame.battlefield.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "battles")
@Getter
@Setter
@NoArgsConstructor
public class BattleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_first_fleet", referencedColumnName = "id", insertable = false, updatable = false)
    private FleetEntity firstFleet;

    @ManyToOne
    @JoinColumn(name = "id_second_fleet", referencedColumnName = "id", insertable = false, updatable = false)
    private FleetEntity secondFleet;
}
