package com.example.onlineticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineticket.details.TicketDetails;
import com.example.onlineticket.service.TicketService;



@RestController
@RequestMapping("/ticket") 
public class TicketController {
	 private final TicketService service;

	    @Autowired
	    public TicketController(TicketService service) {
	        this.service = service;
	    }

	    @GetMapping("/showDetails")
	    @PreAuthorize("hasRole('ROLE_USER')")
	    public List<TicketDetails> getTicketDetails() {
	        return service.getBusTicketDetails();
	        
	    }
	    @GetMapping("/bus")
		public String getBusDetails()
		{
			
			return "Bus : vow transport  is India’s fastest growing online ticket booking platform. AbhiBus is the official ticketing partner of several State Road Transport Corporation (SRTC) operators and over 3500+ private bus partners covering more than 100,000 bus routes";
		}    
	     @PostMapping("/posts")
	     
	    public String addpost(@RequestBody TicketDetails ticketdetails) {
			return service.addDetails(ticketdetails);
	    }    
	    @DeleteMapping("/delete/{id}")
	    @PreAuthorize("hasRole('ROLE_ADMIN')")
	    public String  deleteTicket(@PathVariable long id) {
	    	return service.deleteDetail(id);	
	    }
	    @PutMapping
		public String updateSeatNo(@RequestParam String name ,@RequestParam int seatNo ) {
	       return service.updateSeatNo(name,seatNo);

	    }
	    
	}

