package com.example.catalogue.dto;


public class Product {
	
	public Product(String name, String description, String url, int price) {
		super();
		this.name = name;
		this.description = description;
		this.url = url;
		this.price = price;
	}
	private String  name;
     private String description;
     private String url;
     private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
     
}

