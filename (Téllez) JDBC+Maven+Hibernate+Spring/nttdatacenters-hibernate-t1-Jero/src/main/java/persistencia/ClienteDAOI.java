package persistencia;

import java.util.List;

import modelo_entidades.Cliente;

public interface ClienteDAOI extends CommonDAOI<Cliente>{
	
	public List <Cliente> findByNombreAndApellido1(final String nombre, final String Apellido1);

}
