package com.pinnacle.pinnacleapp.interfaces;

import com.pinnacle.pinnacleapp.domain.Sport;
import org.springframework.http.HttpMethod;

public interface APIClient {
    public Sport[] exchange(String url, HttpMethod method);
}
