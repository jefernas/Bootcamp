package com.nttdata.bootcamp.productservice2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class productservice2Controller {

	@Value("${product.product-name}")
	private String producto;
	
	@GetMapping(path="/reto-config-service/default" )
	public String getProducto() {
		return producto;
	}
}
