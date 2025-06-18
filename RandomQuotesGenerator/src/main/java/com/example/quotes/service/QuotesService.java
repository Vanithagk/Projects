package com.example.quotes.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class QuotesService {
    public String getQuotes() {
    	List<String> quotesList=List.of("Life is not measured by time, but by moments.",
"In the end, we only regret the chances we didn’t take.",
"Life is a journey, not a destination.",
"Every day is a second chance.",
"Life becomes meaningful when you give it meaning.");
    	Random random = new Random();
    	int randomNumber=random.nextInt(quotesList.size());
    	return quotesList.get(randomNumber);
    }
}
