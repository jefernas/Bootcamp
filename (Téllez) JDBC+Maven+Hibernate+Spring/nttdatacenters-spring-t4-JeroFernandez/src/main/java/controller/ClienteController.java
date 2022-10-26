package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import model.ClienteDTO;
import service.ClienteService;

@ResponseBody
@Controller
public class ClienteController {

	@Autowired
	ClienteService serviceCliente;

	
	
	
	@PostMapping(path = "/newCliente")
	public void createCliente(@RequestBody ClienteDTO newClienteDTO) {

	
		
		serviceCliente.createCliente(newClienteDTO);
	}

	
	@DeleteMapping(path = "/deleteCliente")
	public void deleteCliente(@RequestParam("id") Integer idClienteDTO) {

		
		serviceCliente.deleteClienteById(idClienteDTO);

	}

	
	@PutMapping(path = "/updateCliente")
	public void updateCliente(@RequestBody ClienteDTO newClienteDTO) {


		serviceCliente.updateCliente(newClienteDTO);
	}

	
	@GetMapping("/listClientes")
	public ResponseEntity<List<?>> findAll() {
		
			
		
		List<ClienteDTO> listClienteDTO = serviceCliente.findAll();
		
		if (!listClienteDTO.isEmpty()) {
			return new ResponseEntity<>(listClienteDTO, HttpStatus.OK);
		}

		else {

			return new ResponseEntity<>(new ArrayList(), HttpStatus.OK);
		}
	}
	
	
	
	@GetMapping("/returnCliente")
	public ClienteDTO findById(@RequestParam("id") Integer idCliente) {
		
		ClienteDTO newClienteDTO = serviceCliente.findById(idCliente);
	
		return newClienteDTO;
	}
	
	

	@GetMapping("/listClientesByNombre")
	public ResponseEntity<List<ClienteDTO>> findAllByNombre(@RequestParam("nombreCliente") String nombreCliente) {
				
		List<ClienteDTO> listClienteDTO = serviceCliente.findByNombre(nombreCliente);
		
		if (!listClienteDTO.isEmpty()) {
			return new ResponseEntity<>(listClienteDTO, HttpStatus.OK);
		}

		else {

			return new ResponseEntity<>(new ArrayList(), HttpStatus.OK);
		}
	}
	
	
	
	
	

}
