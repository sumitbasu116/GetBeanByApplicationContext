package com.sumit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sumit.model.TestBean;

@Configuration
public class MyConfig {
	
	@Bean
	public TestBean testBean()
	{
		return new TestBean();
	}
}
