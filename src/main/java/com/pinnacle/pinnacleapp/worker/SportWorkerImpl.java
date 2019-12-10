package com.pinnacle.pinnacleapp.worker;

import com.pinnacle.pinnacleapp.domain.Sport;
import com.pinnacle.pinnacleapp.interfaces.APIClient;
import com.pinnacle.pinnacleapp.interfaces.SportService;
import com.pinnacle.pinnacleapp.interfaces.SportWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

@Component
public class SportWorkerImpl implements SportWorker {
    //private final  String URL = "https://api.pinnacle.com/v2/sports";
    private final  String URL = "http://localhost:8080/api/testSport";

    private APIClient apiClient;
    private final SportService sportService;

    @Autowired
    public SportWorkerImpl(APIClient apiClient, SportService sportService) {
        this.apiClient = apiClient;
        this.sportService = sportService;
    }

    @Override
    public void loadSports() {
        Sport[] exchange = apiClient.exchange(URL, HttpMethod.GET);
    }



}
