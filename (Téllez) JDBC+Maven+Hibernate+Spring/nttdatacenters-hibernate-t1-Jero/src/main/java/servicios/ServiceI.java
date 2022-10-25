package servicios;

import java.util.List;

import modelo_entidades.Cliente;

public interface ServiceI {
	
	public void createNewCliente(final Cliente newCliente);
	public void updateNewCliente(final Cliente updateCliente);
	public void deleteNewCliente(final Cliente deleteCliente);
	
	public Cliente findById (final Integer Id);
	
	public List<Cliente> findAll();
	
	public List<Cliente> findByNombreAndApellido1(final String nombre, final String apellido1);

}
