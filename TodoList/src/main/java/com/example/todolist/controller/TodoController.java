package com.example.todolist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/todo")
public class TodoController {
	@GetMapping
     public String getTodoList(Model model,HttpSession session) {
    	 List<String> taskList=(List<String>)session.getAttribute("taskes");
    	 if(taskList==null) {
    		 taskList=new ArrayList<String>();
    		 session.setAttribute("taskes", taskList);
    	 }
    	 model.addAttribute("tk", taskList);
    	 return "todo";
     }
	@PostMapping("/add")
	public String addTodoList(@RequestParam String task,HttpSession session) {
   	 List<String> taskList=(List<String>)session.getAttribute("taskes");
   	 if(taskList==null) {
		 taskList=new ArrayList<String>();
		 session.setAttribute("taskes", taskList);
	 }
   	 taskList.add(task);
   	 return "redirect:/todo";
   	 
	}
	@PostMapping("/delete")
	public String deleteTodo(@RequestParam int index,HttpSession session) {
		List<String> taskList=(List<String>)session.getAttribute("taskes");
		taskList.remove(index);
		return "redirect:/todo";
	}
	@PostMapping("/deleteAll")
	public String deleteAllTodo(HttpSession session) {
//		List<String> taskList=(List<String>)session.getAttribute("taskes");
//		taskList.removeAll(taskList);
		session.removeAttribute("taskes");
		return "redirect:/todo";
	}
}
