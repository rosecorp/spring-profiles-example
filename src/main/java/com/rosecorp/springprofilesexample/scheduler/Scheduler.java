package com.rosecorp.springprofilesexample.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Autowired
    private SomeComponent someComponent;

    @Scheduled(fixedRate = 200)
    public void call() {

        System.out.println(someComponent.call());
    }
}
