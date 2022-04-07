package com.example.spring.jenkins.demo3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemo2ApplicationTests {

	public static Logger logger =  LoggerFactory.getLogger(SpringJenkinsDemo2ApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("SpringJenkinsDemo2ApplicationTests :: contextLoads");
		assertEquals(true, true);
		
	}

}
