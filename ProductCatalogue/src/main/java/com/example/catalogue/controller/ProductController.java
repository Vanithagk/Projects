package com.example.catalogue.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.catalogue.dto.Product;

@Controller
public class ProductController {
    
	@GetMapping("/")
	public String getProduct(Model model) {
		 Product mobile1 = new Product("Samsung Galaxy S23", "Flagship phone with AMOLED display","https://credsell.com/wp-content/uploads/2023/07/6-SAMSUNG-GALAXY-S23-ULTRA-12.jpg", 79999);
	        Product mobile2 = new Product("iPhone 14", "Apple smartphone with A15 Bionic chip", "https://iplanet.one/cdn/shop/files/iPhone_14_Midnight_PDP_Image_Position-1A__WWEN.jpg?v=1691142312", 89999);
	        Product mobile3 = new Product("OnePlus 12", "Premium Android phone with fast charging", "https://kirtisales.in/wp-content/uploads/2024/04/OnePlus-12-R-16GB-256GB.jpg", 65999);
	        Product mobile4 = new Product("Redmi Note 13 Pro", "Budget-friendly phone with great camera", "https://m.media-amazon.com/images/I/71r41+TT2UL.jpg", 21999);	
	        List<Product> products=new ArrayList<Product>();
	        products.add(mobile1);
	        products.add(mobile2);
	        products.add(mobile3);
	        products.add(mobile4);
	        model.addAttribute("productsList",products);
	        return "Catalogue";
	}
	
}
