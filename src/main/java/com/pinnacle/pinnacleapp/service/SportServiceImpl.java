package com.pinnacle.pinnacleapp.service;

import com.pinnacle.pinnacleapp.domain.Sport;
import com.pinnacle.pinnacleapp.interfaces.SportService;
import com.pinnacle.pinnacleapp.repo.SportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportServiceImpl implements SportService {
    private final SportRepo sportRepo;

    @Autowired
    public SportServiceImpl(SportRepo sportRepo) {
        this.sportRepo = sportRepo;
    }

    @Override
    public void createSport(int id, String name) {
        Sport sport = new Sport();
        sport.setId(id);
        sport.setName(name);
        sportRepo.save(sport);
    }
}
