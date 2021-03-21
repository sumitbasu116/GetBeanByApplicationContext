package com.sumit.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtility implements ApplicationContextAware{
	
	private static ApplicationContext applicationContext;
	
	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ApplicationContextUtility.applicationContext=applicationContext;
	}
	
	public static Object getBean(Class<?> clazz)
	{
		return applicationContext.getBean(clazz);
	}

}
