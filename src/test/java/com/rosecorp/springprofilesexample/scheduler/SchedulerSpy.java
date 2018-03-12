package com.rosecorp.springprofilesexample.scheduler;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SchedulerSpy {

    @Bean
    @Primary
    SomeOtherComponent someOtherComponent() {
        SomeOtherComponent someOtherComponent = Mockito.mock(SomeOtherComponent.class);
        Mockito.when(someOtherComponent.someCall()).thenReturn("mocked call");

        return someOtherComponent;
    }

    @Bean
    @Primary
    SomeComponent someComponent() {
        System.out.println("some spy component!");
        return Mockito.spy(new SomeComponent());
    }

}

