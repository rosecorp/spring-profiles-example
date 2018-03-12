package com.rosecorp.springprofilesexample.scheduler;

import com.rosecorp.springprofilesexample.SpringProfilesExampleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringProfilesExampleApplication.class})
public class SchedulerTest {

    @Autowired
    private SomeComponent someComponent;

    @Test
    public void call() throws InterruptedException {
        Thread.sleep(800);

        verify(someComponent, times(5)).call();
    }
}