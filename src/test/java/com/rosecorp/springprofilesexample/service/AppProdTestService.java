package com.rosecorp.springprofilesexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class AppProdTestService implements AppService {

    private String written;

    @Override
    public String read() {
        return "read data from test";
    }

    @Override
    public void write() throws IllegalAccessException {
        this.written = "Can write on test to prod";
    }

    public String getWritten() {
        return written;
    }
}