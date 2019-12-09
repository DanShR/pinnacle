package com.pinnacle.pinnacleapp;

import com.pinnacle.pinnacleapp.interfaces.SportService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@SpringBootTest
class PinnacleappApplicationTests {
    @Autowired
    SportService sportService;
    @Test
    void contextLoads() {
        sportService.createSport("q");
        sportService.createSport("w");
        sportService.createSport("e");
    }

}
