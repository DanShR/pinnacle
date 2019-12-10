package com.pinnacle.pinnacleapp.controller;

import com.pinnacle.pinnacleapp.interfaces.SportWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class LineController {

    private final SportWorker sportWorker;

    @Autowired
    public LineController(SportWorker sportWorker) {
        this.sportWorker = sportWorker;
    }

    @GetMapping
    public String loadSports() {
        sportWorker.loadSports();
        return "done";
    }
    
    @GetMapping("/testSport")
    public String testSports() {
        return "{  \"sports\": [    {      \"id\": 6,      \"name\": \"China\",      \"hasOfferings\": true,    \"leagueSpecialsCount\": 0,\n" +
                "      \"eventSpecialsCount\": 0,\n" +
                "      \"eventCount\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 8,\n" +
                "      \"name\": \"Belgium\",\n" +
                "      \"hasOfferings\": false,\n" +
                "      \"leagueSpecialsCount\": 1,\n" +
                "      \"eventSpecialsCount\": 2,\n" +
                "      \"eventCount\": 0\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
