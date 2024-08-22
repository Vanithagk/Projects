package com.OnlineBusTicket.OnlineTicket;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketDetails,Long> {
	Optional<TicketDetails> findByName(String name);

    boolean existsByName(String name);
   

}
