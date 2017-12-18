package com.ashish.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceInitializeWithNew {
	
	@Autowired
	private AutowireCapableBeanFactory autowireCapableBeanFactory;


	public void initialize() {
		ServiceBean serviceBean = new ServiceBean();
		System.out.println("Befoer Autowirable bean is - "  + serviceBean.getServiceConsumerBean());
		autowireCapableBeanFactory.autowireBean(serviceBean);
		System.out.println("After Autowirable bean is - "  + serviceBean.getServiceConsumerBean());
		
		
	}
}
