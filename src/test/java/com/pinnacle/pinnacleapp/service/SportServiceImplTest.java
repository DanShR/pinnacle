package com.pinnacle.pinnacleapp.service;

import com.pinnacle.pinnacleapp.domain.Sport;
import com.pinnacle.pinnacleapp.interfaces.SportService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class SportServiceImplTest {

    @Autowired
    SportService sportService;
    @Test
    void createSport() {
        sportService.createSport("KZ");
    }
}