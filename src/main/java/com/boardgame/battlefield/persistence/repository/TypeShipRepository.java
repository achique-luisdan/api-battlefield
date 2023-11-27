package com.boardgame.battlefield.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.boardgame.battlefield.persistence.entity.TypeShipEntity;

public interface TypeShipRepository  extends ListCrudRepository<TypeShipEntity, Integer> {

}
