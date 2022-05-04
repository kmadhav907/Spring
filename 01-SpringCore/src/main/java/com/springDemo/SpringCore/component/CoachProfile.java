package com.springDemo.SpringCore.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoachProfile {
	@Value("CricketCoach")
	private String name;

	@Override
	public String toString() {
		return "CoachProfile [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
