package persistencia;

import java.util.List;

import org.hibernate.Session;

import modelo_entidades.Cliente;

public class ClienteDAOImpl extends CommonDAOImpl<Cliente> implements ClienteDAOI {

	/** conexión BBDD */
	private Session sesion;
	
	/** Constructor */
	public ClienteDAOImpl(Session sesion) {
		super(sesion);
		this.sesion=sesion;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findByNombreAndApellido1(String nombre, String apellido1) {
		
		if(!sesion.getTransaction().isActive()) {
			sesion.getTransaction().begin();
		}
		//OJOCUIDAO A CAGARLA EN ESTA QUERY PONIENDO EL NOMBRE DE LA TABLA EN LUGAR DEL @Entity name <----------------------------------------
		final List<Cliente> lista = sesion.createQuery("from Cliente where nombre = '"+nombre+"' and apellido1 = '"+apellido1+"'").list();
		return lista;
	}


}
