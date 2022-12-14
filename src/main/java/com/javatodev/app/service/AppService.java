package com.javatodev.app.service;

import com.javatodev.app.config.AppConfiguration;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class AppService {

    private final AppConfiguration appConfiguration;

    @PostConstruct
    public void readConfigs() {
        log.info("-------------------------------------------`\n");
        log.info("Reading configuration {} - {} \n", appConfiguration.getToken(), appConfiguration.getUsername());
        log.info("-------------------------------------------`\n");
    }

}
