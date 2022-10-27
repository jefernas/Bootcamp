package com.nttdata.webfluxappmicro;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

public class PersonController {

	@RestController
	public class PersonListController {
		@Autowired
		PersonService personService;
		@GetMapping("/person-list-1")
		public Flux<Person> personList1(){
			Person persona1 = new Person("Pepito", "Grillo", 50);
			Flux <Person> flux1 = Flux.just(persona1).delayElements(Duration.ofSeconds(2));
			return flux1;
			
		}
		@GetMapping("/person-list-2")
		public Flux<Person> personList2(){
			Person persona2 = new Person("Rick", "Sánchez", 60);
			Flux <Person> flux2 = Flux.just(persona2).delayElements(Duration.ofSeconds(2));
			return flux2;
		}
		@GetMapping("/person-list-3")
		public Flux<Person> personList3(){
			Person persona3 = new Person("Anónimo", "Pérez", 33);
			Flux <Person> flux3 = Flux.just(persona3).delayElements(Duration.ofSeconds(2));
			return flux3;
		}
		@GetMapping("/person-list-4")
		public Flux<Person> personList4(){
			Person persona4 = new Person("Juan", "Y Medio", 63);
			Flux <Person> flux4 = Flux.just(persona4).delayElements(Duration.ofSeconds(2));
			return flux4;
		}
		
		
		}
}
