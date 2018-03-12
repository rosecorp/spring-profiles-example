package com.rosecorp.springprofilesexample.scheduler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeOtherComponent {


    @Value("${test}")
    private int value;

    public String someCall() {
        return "some other call: " + value;
    }
}
