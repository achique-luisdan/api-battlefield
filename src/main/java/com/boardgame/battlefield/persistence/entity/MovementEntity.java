package com.boardgame.battlefield.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movements")
public class MovementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column (length = 4)
    private String coordinate;

    @ManyToOne
    @JoinColumn(name = "id_fleet", referencedColumnName = "id", insertable = false, updatable = false)
    private FleetEntity fleet;
}
