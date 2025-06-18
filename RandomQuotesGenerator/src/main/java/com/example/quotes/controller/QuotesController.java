package com.example.quotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.quotes.service.QuotesService;

@Controller
public class QuotesController {
	@Autowired
     private QuotesService  quotesService;
	
	@GetMapping("/generate")
	public String showQuotes(Model model) {
		String quote=quotesService.getQuotes();
		model.addAttribute("quotes", quote);
		return "quotes";
	}
}
