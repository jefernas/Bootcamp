package com.nttdata.nttdatacentersspringt4JeroFernandez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages={"Repository"})
@EntityScan(basePackages="Model")
@ComponentScan({"Controller","Service"})
@SpringBootApplication
public class NttdatacentersSpringT4JeroFernandezApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersSpringT4JeroFernandezApplication.class, args);
	}

}
