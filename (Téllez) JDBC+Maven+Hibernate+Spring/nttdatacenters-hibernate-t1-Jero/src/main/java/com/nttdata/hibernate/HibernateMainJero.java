package com.nttdata.hibernate;

import java.util.List;

import org.hibernate.Session;

import modelo_entidades.Cliente;
import modelo_entidades.Hibernate;
import servicios.ServiceImpl;

/** 
 * @author Jero Fernández
 * 
 */

public class HibernateMainJero {

	public static void main(String[] args) {

		System.out.println("_______________________ COMPROBACIÓN DE OPERACIONES EN LA BBDD DESDE EL MÉTODO MAIN __________________________");
		//establecemos la conexión mediante su método creado en la clase Hibernate
		Session sesion = Hibernate.conn();
		
		//instanciamos el servicio para cliente
		ServiceImpl service = new ServiceImpl(sesion);
		
		//instanciamos clientes a cascoporro
		Cliente c1 = new Cliente("Jero","Fernández","Sánchez","44444444M");
		Cliente c2 = new Cliente("Juan Antonio","López","Domingo","55555555M");
		Cliente c3 = new Cliente("Manuel Luis","Pellegrini","Ripamonti","X66666666");
		Cliente c4 = new Cliente("Pepito","Grillo","Grillo","77777777H");
		
		//creamos los clientes en la BD
		service.createNewCliente(c1);
		service.createNewCliente(c2);
		service.createNewCliente(c3);
		service.createNewCliente(c4);
		
		//consultamos todos los clientes
		List<Cliente> lista = service.findAll();
		for(Cliente c :lista) c.toString();
		
		//modificación del cliente c1
		System.out.println("El cliente "+c1.getNombre()+" "+c1.getApellido1()+" va a ser modificado");
		c1.setApellido1("No Sabe");
		c1.setApellido2("Programar");
		service.updateNewCliente(c1);
		System.out.println("Sus datos actualizados son: ");
		System.out.println(c1.toString());
		
				
		//eliminación del cliente c1
		System.out.println("El cliente "+c1.getNombre()+" "+c1.getApellido1()+" va a ser borrado");
		service.deleteNewCliente(c1);
		//comprobación de la eliminación de c1
		System.out.println("Actualmente estos son los clientes que componen la lista: ");
		List<Cliente> lista2 = service.findAll();
		for(Cliente c :lista2) c.toString();
		for(Cliente c :lista) c.toString();
		
		// Búsqueda por id
		System.out.println("Comprobación de búsqueda de cliente por id(2), correspondiente a: ");
		Cliente consultaId =service.findById(3);
		System.out.println(consultaId.toString());
		
		//Búsqueda por nombre y apellido
		lista = service.findByNombreAndApellido1("Pepito", "Grillo");
		for(Cliente c : lista) System.out.println(c.toString());
		

	}
	

}
