package com.boardgame.battlefield.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Ship {
    private List<String> coordinates = new ArrayList<String>();
    private String status;
    private Integer idTypeShip;
    private Integer idFleet;
}
