package modelo_entidades;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {

	//configuración: importar el del paquete de hibernate
	private static Configuration cf = new Configuration().configure();
	//conexión
	private static SessionFactory sf = cf.buildSessionFactory();
	
	/** método que devuelve conexión a BBDD */
	public static Session conn() {
		return sf.openSession();
	}
}
