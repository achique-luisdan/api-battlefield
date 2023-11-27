package com.boardgame.battlefield.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardgame.battlefield.persistence.entity.TypeShipEntity;
import com.boardgame.battlefield.persistence.repository.TypeShipRepository;

@Service
public class TypeShipService {

    @Autowired
    private final TypeShipRepository typeShipRepository;


    public TypeShipService(TypeShipRepository typeShipRepository) {
        this.typeShipRepository = typeShipRepository;
    }

    public List<TypeShipEntity> getAll() {
        return this.typeShipRepository.findAll();
    }

    public TypeShipEntity read(Integer id){
        return this.typeShipRepository.findById(id).orElse(null);
    }
}
