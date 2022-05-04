package com.springDemo.SpringCore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDemo.SpringCore.Set.Dealer;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springDemo/SpringCore/standalone/collections/config.xml");

		// get the hospital bean from the container
		ProductsList prods = (ProductsList) context.getBean("products");
		
		// print the bean
		System.out.println(prods);
		System.out.println(prods.getProductNames().getClass());
	}

}
