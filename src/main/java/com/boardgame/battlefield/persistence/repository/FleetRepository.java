package com.boardgame.battlefield.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardgame.battlefield.persistence.entity.FleetEntity;

public interface FleetRepository extends JpaRepository<FleetEntity, Integer>{

}
