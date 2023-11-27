package com.boardgame.battlefield.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestFleet {
    private List<Ship> ships = new ArrayList<Ship>();
    private String battleId;
    private String playerName;
}
