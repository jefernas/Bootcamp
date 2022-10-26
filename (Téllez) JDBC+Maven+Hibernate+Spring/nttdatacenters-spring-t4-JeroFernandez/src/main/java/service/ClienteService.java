package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Cliente;
import model.ClienteDTO;
import repository.ClienteRepository;
import service.interfaces.ClienteServiceInterface;

@Service
public class ClienteService implements ClienteServiceInterface {

	@Autowired
	ClienteRepository clienteRep;



	@Override
	public void createCliente(ClienteDTO newCliente) {

		Cliente cl = createDTOclient(newCliente);

		clienteRep.save(cl);

	}

	@Override
	public void deleteClienteById(Integer idCliente) {

		clienteRep.deleteById(idCliente);
	}

	@Override
	public void updateCliente(ClienteDTO updateCliente) {

		Cliente cliente = createDTOclient(updateCliente);

		clienteRep.save(cliente);
	}

	@Override
	public List<ClienteDTO> findAll() {

	 List<ClienteDTO> listadoClienteDTO= new ArrayList<>();
		
		List<Cliente> listadoCliente = clienteRep.findAll();
		
		for (Cliente cliente : listadoCliente) {
			
			ClienteDTO clienteDTO= createClienteDTO(cliente);
			listadoClienteDTO.add(clienteDTO);	
		}

		return listadoClienteDTO;

	}

	@Override
	public ClienteDTO findById(Integer idCliente) {
		
		ClienteDTO clienteDTO = null;

		Optional<Cliente> cliente = clienteRep.findById(idCliente);

		if (!cliente.isEmpty()) {

			clienteDTO = createClienteDTO(cliente.get());
		}

		return clienteDTO;

	}

	@Override
	public List<ClienteDTO> findByNombre(String nombreCliente) {
		
	 List<ClienteDTO> listaClientDTO= new ArrayList<>();
		
		List<Cliente> listaCliente = clienteRep.findByNombre(nombreCliente);
		
		for (Cliente c : listaCliente) {
			
			ClienteDTO clienteDTO= createClienteDTO(c);
			listaClientDTO.add(clienteDTO);
			
		}

		return listaClientDTO;
		
		
	}

	
	
	private Cliente createDTOclient(ClienteDTO clienteDTO) {

		Cliente cliente = new Cliente();

		cliente.setId(clienteDTO.getId());
		cliente.setNombre(clienteDTO.getNombre());
		cliente.setApellido(clienteDTO.getApellido());
		cliente.setDni(clienteDTO.getDni());
		cliente.setNacimiento(clienteDTO.getNacimiento());

		return cliente;
	}

	//Cliente-ClienteDTO
	private ClienteDTO createClienteDTO(Cliente cliente) {

		ClienteDTO clienteDTO = new ClienteDTO();

		clienteDTO.setId(cliente.getId());
		clienteDTO.setNombre(cliente.getNombre());
		clienteDTO.setApellido(cliente.getApellido());
		clienteDTO.setDni(cliente.getDni());
		clienteDTO.setNacimiento(cliente.getNacimiento());

		return clienteDTO;
	}

	

}
