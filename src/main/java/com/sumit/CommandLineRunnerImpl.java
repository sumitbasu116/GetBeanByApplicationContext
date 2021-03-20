package com.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.sumit.model.TestBean;
import com.sumit.service.MultipurposeService;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    
	@Autowired
    ApplicationContext applicationContext;
	
	@Autowired
	MultipurposeService multipurposeService;
	
	@Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner, printing all arguments...");
		TestBean testBean = (TestBean) applicationContext.getBean(TestBean.class);
		testBean.setMsg("Hey There");
		System.out.println(testBean);
		
		TestBean testBeanState = multipurposeService.getTestBeanState();
		System.out.println(testBeanState);
		
		TestBean testBeanStateContext = multipurposeService.getTestBeanStateFromContext();
		System.out.println(testBeanStateContext);
		
    }
}

