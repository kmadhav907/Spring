package com.springDemo.SpringCore.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDemo.SpringCore.Set.Dealer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springDemo/SpringCore/Set/config.xml");
		
		Dealer dealer = (Dealer)context.getBean("carDealer");
		System.out.println(dealer);
	}

}
