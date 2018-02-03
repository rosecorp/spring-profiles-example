package com.rosecorp.springprofilesexample.controller;

import com.rosecorp.springprofilesexample.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class AppController {

    private static final Logger LOG = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private AppService appService;

    @RequestMapping(path = "/api", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String api() {
        LOG.info("LOG: {}", appService.read());
        return appService.read();
    }

}
