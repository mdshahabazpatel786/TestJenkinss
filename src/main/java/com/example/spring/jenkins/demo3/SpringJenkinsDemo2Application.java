package com.example.spring.jenkins.demo3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemo2Application {

	public static Logger logger =  LoggerFactory.getLogger(SpringJenkinsDemo2Application.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDemo2Application.class, args);
	}

	public void begin()
	{
		logger.info("SpringJenkinsDemo2Application :: begin");
	}
}
