package com.OnlineBusTicket.OnlineTicket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TicketService {

    private final  TicketRepository ticketrepo;
    @Autowired
    public TicketService(TicketRepository ticketrepo) {
    	this.ticketrepo=ticketrepo;
    }
    public List<TicketDetails> getBusTicketDetails() {
    	return ticketrepo.findAll();
    }

    public String addDetails(TicketDetails ticketDetails) {
        ticketrepo.save(ticketDetails);
        return "Details Added Successfully";
    }
    public String deleteDetail(long id) {
        if (ticketrepo.existsById(id)) { 
            ticketrepo.deleteById(id); 
            return "success";
        } else {
            return "Not found"; 
        }
    }

    	public String updateSeatNo(String name ,int seatNo ) {
    		for(TicketDetails ob:ticketrepo.findAll()) {
        		if(ob.getName().equals(name)) {
        			ob.setSeatNo(seatNo);
        			ticketrepo.save(ob);
        			return "Updated successfully";
        		}

    		}
    		return "Name not found";
    	}
    }


