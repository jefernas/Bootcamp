package com.nttdata.designpatterns.designpatterns;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import singleton.Persona;
import singleton.SingletonPersona;

@SpringBootApplication
public class DesignpatternsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SingletonPersona sp = null;
		sp.instanciaUnica("Juan Antonio", 33);
		sp.singletonOperation();
	}

}
