package com.rosecorp.springprofilesexample.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeComponent {

    @Autowired
    private SomeOtherComponent someOtherComponent;

    public String call() {
        return "some call has happened! " + someOtherComponent.someCall();
    }

}
