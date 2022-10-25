package com.nttdata.bootcamp.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class ProductServiceController {

	@Value("${server.port}")
	private String port;
	
	@GetMapping(path = "/port")
	public String getPort() {
		return "el puerto del micro es: "+ port;
	}
}
