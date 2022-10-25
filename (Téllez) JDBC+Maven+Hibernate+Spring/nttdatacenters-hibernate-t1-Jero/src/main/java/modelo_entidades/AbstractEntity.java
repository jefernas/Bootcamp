package modelo_entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public abstract class AbstractEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** variables para auditoria*/
	private String usuarioActualizacion;
	private Date fechaActualizacion;
	
	//recibe un long por parametro, que se declara como final para evitar liadas
	public abstract void setId(final Integer id);
	public abstract Integer getId();
	
	
	@Column(name= "AUDIT_USUARIO_ACTUALIZACION, nullable = false")
	public String getUsuarioActualizacion() {
		return usuarioActualizacion;
	}
	
	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion=usuarioActualizacion;
	}
	@Column(name= "AUDIT_FECHA_ACTUALIZACION, nullable = false")
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

}
