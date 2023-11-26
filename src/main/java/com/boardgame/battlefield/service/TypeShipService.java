package com.boardgame.battlefield.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.boardgame.battlefield.persistence.entity.TypeShipEntity;

@Service
public class TypeShipService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TypeShipService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<TypeShipEntity> getAll() {

        return this.jdbcTemplate.query("SELECT ts.id, ts.name, ts.description, ts.size FROM types_ship AS ts", new BeanPropertyRowMapper<>(TypeShipEntity.class));
    }
}
