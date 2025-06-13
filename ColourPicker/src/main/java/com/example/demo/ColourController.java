package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ColourController {
       	@GetMapping("/")
       	public String getColorPicker(@RequestParam(defaultValue="#123456") String color,Model model) {
       		model.addAttribute("selectedcolor",color);
       		return "color";
       	}
}
