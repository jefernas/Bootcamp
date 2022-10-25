package com.nttdata.designpatterns.designpatterns;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import singleton.SingletonPersona;

@SpringBootApplication
public class DesignpatternsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsApplication.class, args);
	
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		SingletonPersona sp = SingletonPersona.getInstance("Juan Antonio", 33);
		
		sp.singletonOperation();
		
		//comprobación para demostrar que no se puede volver a instanciar.
		//el metodo singletonOperation() debe devolver los valores de la primera intancia
		sp.getInstance("pepe", 0);
		sp.singletonOperation();
		
	
	}

}
