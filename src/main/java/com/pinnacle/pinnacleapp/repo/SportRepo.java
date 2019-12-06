package com.pinnacle.pinnacleapp.repo;

import com.pinnacle.pinnacleapp.domain.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepo extends JpaRepository<Sport, Integer> {
}
