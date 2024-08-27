package com.example.SpringUpperCase.UpperCaseSpringTH;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NameController {
	@GetMapping("/index")
    public String viewName(Model model) {
    	model.addAttribute("Name",new Name());
    	return "index";
    }
	
	@PostMapping("/uppercase")
	public String upperName(@ModelAttribute Name name,Model model) {
		model.addAttribute("name",name);
		return "uppercases";
	}
	
		


}