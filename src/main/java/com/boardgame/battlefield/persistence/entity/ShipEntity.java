package com.boardgame.battlefield.persistence.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "ships")
@Getter
@Setter
@NoArgsConstructor
public class ShipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_type_ship", referencedColumnName = "id")
    private TypeShipEntity typeShip;

    @ManyToOne
    @JoinColumn(name = "id_fleet", referencedColumnName = "id")
    @JsonIgnore
    private FleetEntity fleet;

    @Column(nullable = false)
    private List<String> coordinates;

    @Column()
    private String status;
}
