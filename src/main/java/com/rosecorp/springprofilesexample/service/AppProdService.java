package com.rosecorp.springprofilesexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class AppProdService implements AppService {

    private String written;

    @Override
    public String read() {
        return "read from prod service";
    }

    @Override
    public void write() throws IllegalAccessException {
        throw new IllegalAccessException("can not write on prod!");
    }

    public String getWritten() {
        return written;
    }
}
