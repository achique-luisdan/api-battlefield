package com.boardgame.battlefield.persistence.entity;

import java.util.List;

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

    @OneToMany(mappedBy = "fleet")
    private List<ShipEntity> ships;

    @ManyToOne
    @JoinColumn(name = "id_player", referencedColumnName = "id", insertable = false, updatable = false)
    private PlayerEntity player;

    @OneToMany(mappedBy = "fleet")
    private List<MovementEntity> movements;

}
