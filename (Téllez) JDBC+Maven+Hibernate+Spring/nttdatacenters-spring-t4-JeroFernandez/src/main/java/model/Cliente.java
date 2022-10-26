package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "cliente", schema = "springcliente")
public class Cliente {
	
	//campos de la tabla
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.AUTO)//autoincrement
	@Column
	private Integer id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String apellido;
	
	@Column(nullable = false, unique = true)
	private String dni;
	
	@Column(nullable = false)
	private String nacimiento;

		
	//constructor con parámetros
	public Cliente(String nombre, String apellido, String dni, String nacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nacimiento = nacimiento;
	}

	//constructor por defecto
	public Cliente() {}

	
	
	
	//los clásicos getters & setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	//toString
	@Override
	public String toString() {
		return "Datos del cliente: [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento="
				+ nacimiento + "]";
	}
		

}




