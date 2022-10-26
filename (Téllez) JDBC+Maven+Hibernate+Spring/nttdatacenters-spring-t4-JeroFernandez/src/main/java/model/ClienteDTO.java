package model;


public class ClienteDTO {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String dni;
	private String nacimiento;
	
	
	
	//constructor con parámetros
	public ClienteDTO(String nombre, String apellido, String dni, String nacimiento ) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nacimiento = nacimiento;
	}

	//constructor por defecto
	public ClienteDTO() {}

	
	
	//getters-setters y toString
	@Override
	public String toString() {
		return "ClienteDTO [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", nacimiento=" + nacimiento + "]";
	}

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
	

}
