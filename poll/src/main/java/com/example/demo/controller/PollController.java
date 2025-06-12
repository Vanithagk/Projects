package com.example.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("pollResults")
public class PollController {
  
	private List<String> questions=Arrays.asList("What is your Fav Language","Which Framework do you prefer?",
			"What is your prefferrd DB?");
	
	private Map<String,List<String>> options=new HashMap<String,List<String>>(){
		{
	    put(questions.get(0),Arrays.asList("Java","Phython","Javascript","C++"));
		put(questions.get(1),Arrays.asList("SpringBoot","Django","Angular","Flask"));
		put(questions.get(2),Arrays.asList("postgresql","MangoDB","SqlLite","SQL"));

	}
};

@ModelAttribute("pollResults")
private Map<String,Map<String,Integer>> getPollResult()
{
    Map<String,Map<String,Integer>> pollResult=new HashMap<String,Map<String,Integer>>();
    for(String question:questions) {
    	pollResult.put(question, new HashMap<>());
    	for(String option:options.get(question)) {
    		pollResult.get(question).put(option,0);
    	}
    }
    return pollResult;
}

@GetMapping("/")
public String startPoll()
{
	return "redirect:poll/0";
}
@GetMapping("/poll/{index}")
public String showQuestion(@PathVariable int index,Model model,@ModelAttribute("pollResults")Map<String,Map<String,Integer>>pollResult) {
	if(index>=questions.size()) {
		return "results";
	}
	String question=questions.get(index);
	model.addAttribute("question",questions.get(index));
	model.addAttribute("options",options.get(question));
	model.addAttribute("index",index);
	return "poll";
}
@PostMapping("vote/{index}")
public String showQuestion(@PathVariable int index,@RequestParam String option,@ModelAttribute("pollResults")Map<String,Map<String,Integer>>pollResults)
{
	String question=questions.get(index);
	pollResults.get(question).put(option, pollResults.get(question).get(option) + 1);
	return "redirect:/poll/"+(index+1);
	

}
}

