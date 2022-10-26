package service.interfaces;

import java.util.List;

import model.ClienteDTO;

public interface ClienteServiceInterface {

	
	public void createCliente(ClienteDTO newCliente);
	public void deleteClienteById(Integer idCliente);
	public void updateCliente(ClienteDTO updateCliente);
	public List<ClienteDTO> findAll();
	public ClienteDTO findById(Integer idCliente);
	public List<ClienteDTO> findByNombre(String nombreCliente);
	
	
}
