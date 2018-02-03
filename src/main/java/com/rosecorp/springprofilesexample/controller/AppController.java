package com.rosecorp.springprofilesexample.controller;

import com.rosecorp.springprofilesexample.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

import org.slf4j.MDC;

@RestController
public class AppController {

    private static final Logger logger = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private AppService appService;

    @RequestMapping(path = "/api", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String api() throws InterruptedException {
        long startTime = System.currentTimeMillis();

        waitFrom500To2000();

        Long estimatedTime = System.currentTimeMillis() - startTime;
        MDC.put("execution", estimatedTime + "");

        logger.info("Execution time of the query {} ", estimatedTime);

        return appService.read() + " in estimated milis: " + estimatedTime;
    }

    private void waitFrom500To2000() throws InterruptedException {
        int max = 2000;
        int min = 500;
        int time = new Random().nextInt((max - min) + 1) + min;
        Thread.sleep(time);
    }

}
