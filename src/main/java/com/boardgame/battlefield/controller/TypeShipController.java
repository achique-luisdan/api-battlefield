package com.boardgame.battlefield.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boardgame.battlefield.persistence.entity.TypeShipEntity;
import com.boardgame.battlefield.service.TypeShipService;

@RestController
@RequestMapping("/api/types-ship")
public class TypeShipController {
    @Autowired
    private final TypeShipService typeShipService;

    public TypeShipController(TypeShipService typeShipService) {
        this.typeShipService = typeShipService;
    }


    @GetMapping
    public ResponseEntity<List <TypeShipEntity>> getAll(){
        return ResponseEntity.ok(this.typeShipService.getAll());
    }
}
