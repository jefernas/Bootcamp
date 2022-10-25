package com.nttdata.bootcamp.retoconfigserver.retoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RetoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoConfigServerApplication.class, args);
	}

}
