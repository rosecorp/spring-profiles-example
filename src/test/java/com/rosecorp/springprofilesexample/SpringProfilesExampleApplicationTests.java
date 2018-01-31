package com.rosecorp.springprofilesexample;

import com.rosecorp.springprofilesexample.service.AppService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringProfilesExampleApplicationTests {

	@Autowired
	private AppService appService;

	@Test
	public void contextLoads() {
		System.out.println(appService.read());
	}

}
