package com.boardgame.battlefield.persistence.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fleets")
@Getter
@Setter
@NoArgsConstructor
public class FleetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToMany(mappedBy = "fleet", cascade = CascadeType.ALL)
    private List<ShipEntity> ships = new ArrayList<ShipEntity>();

    @ManyToOne
    @JoinColumn(name = "id_player", referencedColumnName = "id", insertable = false, updatable = false)
    private PlayerEntity player;

    @OneToMany(mappedBy = "fleet")
    private List<MovementEntity> movements;

    public void addShip(ShipEntity ship) {
        this.ships.add(ship);
        ship.setFleet(this);
    }
}
