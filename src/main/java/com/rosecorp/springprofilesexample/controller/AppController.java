package com.rosecorp.springprofilesexample.controller;

import com.rosecorp.springprofilesexample.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping(path = "/api", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String api() {
        return appService.read();
    }

}
