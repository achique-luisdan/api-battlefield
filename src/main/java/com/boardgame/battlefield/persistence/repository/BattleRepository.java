package com.boardgame.battlefield.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.boardgame.battlefield.persistence.entity.BattleEntity;

public interface BattleRepository extends ListCrudRepository<BattleEntity, Integer>  {
    
}
