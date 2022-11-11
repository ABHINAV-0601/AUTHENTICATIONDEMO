package com.example.AUTHENTICATIONDEMO.service;

import com.example.AUTHENTICATIONDEMO.domain.User;
import org.springframework.context.annotation.Bean;

import java.util.Map;

public interface ServiceTokenGenerator {
    Map<String,String> generateToken(User user);
}
