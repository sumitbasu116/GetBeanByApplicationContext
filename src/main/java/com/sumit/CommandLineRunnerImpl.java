package com.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.sumit.model.TestBean;
import com.sumit.service.MultipurposeService;
import com.sumit.service.ThirdPartyModel;

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
		
		/* The real power of ApplicationContext explained here where we need to create a new bean manually(non Spring Bean)
		 * and that new Bean contains a Spring managed Bean
		 * e.g. ThirdPartyModel is not a component or not a Spring Bean, but ThirdPartyModel contains
		 * MyApplicationService which is a Spring Bean
		 */
		ThirdPartyModel thirdPartyModel = new ThirdPartyModel();
		thirdPartyModel.setThirdPartyModel();
		System.out.println(thirdPartyModel);
		
    }
}

