package com.pinnacle.pinnacleapp.HTTP;

import com.pinnacle.pinnacleapp.domain.Sport;
import com.pinnacle.pinnacleapp.interfaces.APIClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Collections;

@Component
@Scope(value = "prototype")
public class APIClientImpl implements APIClient {

    @Value("${env.auth}")
    private String auth;

    private final RestTemplate restTemplate = new RestTemplate();
    private HttpHeaders headers = new HttpHeaders();

    @PostConstruct
    private void init() {
        initHeaders();
    }

    private void initHeaders() {
        headers.add("Authorization", "Basic " + auth);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept((Collections.singletonList(MediaType.APPLICATION_JSON)));
    }


    @Override
    public Sport[] exchange(String url, HttpMethod method) {

        ResponseEntity<Sport[]> response = restTemplate.getForEntity(url, Sport[].class);
        Sport[] sports = response.getBody();
        return sports;
    }
}
