package persistencia;

import java.util.List;

public interface CommonDAOI<T> {

	public void create (final T paramT);
	public void update (final T paramT);
	public void delete (final T paramT);
	
	public T findById (final Integer id);
	
	public List<T> findAll();
}
