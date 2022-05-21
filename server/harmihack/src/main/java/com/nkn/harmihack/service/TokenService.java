package com.nkn.harmihack.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Value("${token.riot}")
    private String riotToken;

    public String getRiotToken() {
        return riotToken;
    }
}
