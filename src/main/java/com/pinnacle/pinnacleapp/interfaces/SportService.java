package com.pinnacle.pinnacleapp.interfaces;

import com.pinnacle.pinnacleapp.domain.Sport;

import java.util.List;

public interface SportService {
    public void createSport(int id, String name);
    public List<Sport> findAll();
}
