package com.boardgame.battlefield.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boardgame.battlefield.dto.RequestFleet;
import com.boardgame.battlefield.dto.Ship;
import com.boardgame.battlefield.persistence.entity.FleetEntity;
import com.boardgame.battlefield.persistence.entity.ShipEntity;
import com.boardgame.battlefield.persistence.entity.TypeShipEntity;
import com.boardgame.battlefield.persistence.repository.TypeShipRepository;
import com.boardgame.battlefield.service.FleetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/fleets")
public class FleetController {
    @Autowired
    private final FleetService fleetService;

    @Autowired
    private final TypeShipRepository typeShipRepository;

    public FleetController(FleetService fleetService, TypeShipRepository typeShipRepository) {
        this.fleetService = fleetService;
        this.typeShipRepository = typeShipRepository;
    }

    @PostMapping
    public ResponseEntity<FleetEntity> create( @RequestBody RequestFleet request ) {
        FleetEntity fleet = new FleetEntity();
        for (Ship ship : request.getShips()) {
            ShipEntity shipEntity = new ShipEntity();
            shipEntity.setCoordinates(ship.getCoordinates());
            shipEntity.setStatus(ship.getStatus());
            TypeShipEntity typeShipEntity = this.typeShipRepository.findById(ship.getIdTypeShip()).orElse(null);
            shipEntity.setTypeShip(typeShipEntity);
            fleet.addShip(shipEntity);
        }
        return ResponseEntity.ok(this.fleetService.create(fleet));
    }
}
