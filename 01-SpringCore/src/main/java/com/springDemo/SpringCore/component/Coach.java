package com.springDemo.SpringCore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("supercoach")
@Scope("prototype")
public class Coach {
	@Value("${dbUser}")
	private String dbUser;

	public String getDbUser() {
		return dbUser;
	}
	@Value("#{topics}")
	private List<String> topics;
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	@Value("11")
	private int id = 9;
	
	@Value("Max")
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Autowired
	private CoachProfile profile;

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public CoachProfile getProfile() {
		return profile;
	}

	public void setProfile(CoachProfile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Coach [dbUser=" + dbUser + ", topics=" + topics + ", id=" + id + ", name=" + name + ", profile="
				+ profile + "]";
	}
	





}
