package com.springDemo.SpringCore.propertyPlaceHolder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// create the spring container - box
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
						"com/springDemo/SpringCore/propertyPlaceHolder/config.xml");

				// get the hospital bean from the container
				DataAccessObject mydao = (DataAccessObject) context.getBean("mydao");
				
				// print the bean
				System.out.println(mydao);
	}

}
