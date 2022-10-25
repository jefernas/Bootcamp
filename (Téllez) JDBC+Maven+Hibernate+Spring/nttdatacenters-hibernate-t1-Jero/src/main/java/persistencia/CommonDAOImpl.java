package persistencia;

import modelo_entidades.AbstractEntity;
import java.lang.reflect.ParameterizedType;
import java.util.List;	
import org.hibernate.Session;
	
public abstract class CommonDAOImpl<T extends AbstractEntity> implements CommonDAOI<T> {
	
	private Class<T> entityClass;
	
	public Class<T> getEntityClass() {
		return entityClass;
		}
	
	public void setEntityClass(Class<T> entityClass) {
			this.entityClass = entityClass;
		}
	
	//Session para la conexion
	private Session sesion;
	
	
	@SuppressWarnings("unchecked")
	public CommonDAOImpl(Session sesion) {
		setEntityClass((Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
			this.sesion = sesion;
		}
	
	/** Implementación de los métodos de la interfaz */
	@Override
	public void create(final T paramT) {
	
		if (!sesion.getTransaction().isActive()) {
			sesion.getTransaction().begin();
		}
		sesion.save(paramT);
		sesion.flush();
		sesion.getTransaction().commit();
		}
		
	
	@Override
	public void update(final T paramT) {
	
		if (!sesion.getTransaction().isActive()) {
			sesion.getTransaction().begin();
		}
		sesion.saveOrUpdate(paramT);
		sesion.getTransaction().commit();
		}
	
	
	@Override
	public void delete(final T paramT) {
	
		if (!sesion.getTransaction().isActive()) {
			sesion.getTransaction().begin();
		}
		sesion.delete(paramT);
		sesion.getTransaction().commit();
		}
	
	
	@Override
	public T findById(final Integer id) {
	
		if (!sesion.getTransaction().isActive()) {
			sesion.getTransaction().begin();
		}
	
		return sesion.get(this.entityClass, id);
	
		}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
	
		if (!sesion.getTransaction().isActive()) {
			sesion.getTransaction().begin();
		}
		//OJOCUIDAO CON EL ESPACIO ENTRE EL DICHOSO FROM Y LAS COMILLAS!!!! <--------------------------------
		List<T> lista = sesion.createQuery("FROM "+ this.entityClass.getName()).list();
	
		return lista;
		
		}
	
	
}
