package com.springDemo.SpringCore.Set;

import java.util.Set;

public class Dealer {
	private Set<String> models;

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Dealer [models=" + models + "]";
	}
	
}
