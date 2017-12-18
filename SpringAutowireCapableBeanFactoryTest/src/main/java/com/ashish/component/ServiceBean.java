package com.ashish.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceBean {
	
	@Autowired
	private ServiceConsumerBean serviceConsumerBean;
	
	public void printService() {
		System.out.println(getServiceConsumerBean());
	}

	public ServiceConsumerBean getServiceConsumerBean() {
		return serviceConsumerBean;
	}

	public void setServiceConsumerBean(ServiceConsumerBean serviceConsumerBean) {
		this.serviceConsumerBean = serviceConsumerBean;
	}
}
