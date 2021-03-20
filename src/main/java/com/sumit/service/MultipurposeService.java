package com.sumit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.sumit.model.TestBean;

@Service
public class MultipurposeService {

	@Autowired
	private TestBean testBean;
	
	@Autowired
	ApplicationContext applicationContext;
	
	public TestBean getTestBeanState() {
		testBean.setMsg(testBean.getMsg().concat("Hello"));
		return testBean;
	}
	
	public TestBean getTestBeanStateFromContext() {
		return applicationContext.getBean(TestBean.class);
	}

}
