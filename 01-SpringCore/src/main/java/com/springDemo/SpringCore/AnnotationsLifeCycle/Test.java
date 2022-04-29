package com.springDemo.SpringCore.AnnotationsLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springDemo/SpringCore/AnnotationsLifeCycle/config.xml");
		context.registerShutdownHook();

		// get the hospital bean from the container
		Patient patient = (Patient) context.getBean("patient");
		
		// print the bean
		System.out.println(patient);
		
	}

}
