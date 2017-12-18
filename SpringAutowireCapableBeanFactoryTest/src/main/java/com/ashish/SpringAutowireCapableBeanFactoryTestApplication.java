package com.ashish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashish.component.ServiceInitializeWithNew;

@SpringBootApplication
public class SpringAutowireCapableBeanFactoryTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringAutowireCapableBeanFactoryTestApplication.class, args);
		
		ServiceInitializeWithNew serviceInitializeWithNew = context.getBean(ServiceInitializeWithNew.class);
		 serviceInitializeWithNew.initialize();
	}
}
