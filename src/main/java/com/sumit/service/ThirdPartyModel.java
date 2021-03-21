package com.sumit.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sumit.utils.ApplicationContextUtility;

//provided by Third party library and which is not a component and suppose we 
//want to create new Object every time of ThirdPartyModel
public class ThirdPartyModel {
	
	private String type;
	/* calling our bean to insert type in ThirdPartyModel at runtime and need to maintain injection
	 * In this case, the below autowiring will not work.
	 */
	//@Autowired
	private MyApplicationService myApplicationService = (MyApplicationService) ApplicationContextUtility.getBean(MyApplicationService.class);
	
	public String setThirdPartyModel()
	{
		this.type = myApplicationService.getMyMessage();
		return type;
	}
}
