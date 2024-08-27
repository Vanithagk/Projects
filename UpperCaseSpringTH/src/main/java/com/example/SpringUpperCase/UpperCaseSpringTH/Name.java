package com.example.SpringUpperCase.UpperCaseSpringTH;

public class Name {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     public String uppercase() {
    	 return name.toUpperCase();
     }

}