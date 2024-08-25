package com.example.onlineticket.OnlineTicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.onlineticket.repository.TicketRepository;

@SpringBootApplication
@ComponentScan({"com.example.onlineticket"})
@EntityScan("com.example.onlineticket")
//@EnableJpaRepositories("com.example.onlineticket")
@EnableJpaRepositories(basePackageClasses = TicketRepository.class)

public class OnlineTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTicketApplication.class, args);
	}

}
