package com.rosecorp.springprofilesexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class AppDevService implements AppService {

    private String written;

    @Override
    public String read() {
        return "read from dev";
    }

    @Override
    public void write() {
        this.written = "written to dev";
    }

    public String getWritten() {
        return written;
    }
}
