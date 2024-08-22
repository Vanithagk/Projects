package com.OnlineBusTicket.OnlineTicket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/TicketController")
public class TicketController {

    private final TicketService service;

    @Autowired
    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping("/bus")
    public List<TicketDetails> getTicketDetails() {
        return service.getBusTicketDetails();
    }

    @PostMapping("/bus")
    public String addDetails( @Validated @RequestBody TicketDetails ticketDetails) {
        return service.addDetails(ticketDetails);
    }
    @DeleteMapping("/bus")
    public String  deletename(@RequestParam long id) {
    	return service.deleteDetail(id);	
    }
    @PutMapping("/bus")
	public String updateSeatNo(@RequestParam String name ,@RequestParam int seatNo ) {
       return service.updateSeatNo(name,seatNo);

    }
    
}
