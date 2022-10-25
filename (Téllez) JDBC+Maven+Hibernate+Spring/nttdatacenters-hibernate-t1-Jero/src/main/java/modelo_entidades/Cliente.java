package modelo_entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** tabla Cliente, nombre de la base de datos: HibernateDB */
@Entity
@Table(name= "Cliente", schema ="HibernateDB")
public class Cliente extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/** variables-columnas de la tabla */
	@Id //clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
	private Integer id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido1;
	@Column(nullable = false)
	private String apellido2;
	@Column(unique = true, nullable = false, length = 9) //identificador único, not null, max 9 carácteres
	private String dni;
	
	//constructor por defecto 
	public Cliente() {}
	
	//Constructor con parámetros, menos el id que lo genera autoincrement la BBDD
	public Cliente(String nombre, String apellido1, String apellido2, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}
	
	//Métodos implementados de la interfaz AbstractEntity
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	
	
	//El clásico toString, por si acaso
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
			+ ", dni=" + dni + "]";
		}
	
	

}
