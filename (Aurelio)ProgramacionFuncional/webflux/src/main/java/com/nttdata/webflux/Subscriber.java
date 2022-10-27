package com.nttdata.webflux;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Flux;

public class Subscriber {

	public static void print(Integer n) {
		System.out.println("Subscriber 1: " + n);

	}

@GetMapping(path = "/numbers-with-subscribers", produces = "text/event-stream")

public Flux<Integer> numbersWithSubscribers() {
	Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
	
	flux.subscribe(n -> Subscriber.print(n)); // Suscriptor 1

	flux.subscribe(n -> System.out.println("Subscriber 2: " + n)); // Suscriptor 2
	
	return flux; // Suscriptor 3

	
	}
}
