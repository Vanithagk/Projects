package com.example.onlineticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineticket.details.TicketDetails;

public interface TicketRepository extends JpaRepository<TicketDetails,Long> {
	//Optional<TicketDetails> findByName(String name);

}


