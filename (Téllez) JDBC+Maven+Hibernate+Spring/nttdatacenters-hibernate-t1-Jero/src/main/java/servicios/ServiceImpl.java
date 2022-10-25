package servicios;

import java.util.List;

import org.hibernate.Session;

import modelo_entidades.Cliente;
import persistencia.ClienteDAOImpl;

public class ServiceImpl implements ServiceI {
	
	private ClienteDAOImpl clienteDao;
	
	public ServiceImpl(Session sesion) {
		this.clienteDao = new ClienteDAOImpl(sesion);
	}

	@Override
	public void createNewCliente(Cliente newCliente) {
		clienteDao.create(newCliente);
		System.out.println("Creación de nuevo cliente realizada con éxito");
		
	}

	@Override
	public void updateNewCliente(Cliente updateCliente) {
		clienteDao.update(updateCliente);
		System.out.println("Actualización de cliente realizada con éxito");
		
	}

	@Override
	public void deleteNewCliente(Cliente deleteCliente) {
		clienteDao.delete(deleteCliente);
		System.out.println("Eliminación de cliente realizada con éxito");
		
	}

	@Override
	public Cliente findById(Integer Id) {
		
		return clienteDao.findById(Id);
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public List<Cliente> findByNombreAndApellido1(String nombre, String apellido1) {
		
		return clienteDao.findByNombreAndApellido1(nombre, apellido1);
	}

}
