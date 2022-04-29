package com.springDemo.SpringCore.dibasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springDemo/SpringCore/dibasic/config.xml");
		
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
	}

}
