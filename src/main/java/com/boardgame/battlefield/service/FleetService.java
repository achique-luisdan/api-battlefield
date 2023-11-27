package com.boardgame.battlefield.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardgame.battlefield.persistence.entity.FleetEntity;
import com.boardgame.battlefield.persistence.repository.FleetRepository;

@Service
public class FleetService {

    @Autowired
    private final FleetRepository fleetRepository;

    public FleetService(FleetRepository fleetRepository){
        this.fleetRepository = fleetRepository;
    }

    public FleetEntity create(FleetEntity fleet){
        return this.fleetRepository.save(fleet);
    }
}
