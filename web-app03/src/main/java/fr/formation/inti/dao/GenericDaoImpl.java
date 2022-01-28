package fr.formation.inti.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GenericDaoImpl<T, I extends Serializable> implements IGenericDao<T, I> {

	private static final Log log = LogFactory.getLog(GenericDaoImpl.class);
	private final Class<T> tClass;

	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		ParameterizedType genericSuperClass = (ParameterizedType) getClass().getGenericSuperclass();
		this.tClass = (Class<T>) genericSuperClass.getActualTypeArguments()[0];
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public I save(T t) {
		return (I) session.save(t);
	}

	@Override
	public void update(T t) {
		session.update(t);
	}

	@Override
	public void delete(T t) {
		session.delete(t);
	}

	@Override
	public T findById(I i) {
		return session.find(tClass, i);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		String hql = "from " + tClass.getName() + " t";
		return session.createQuery(hql).getResultList();
	}

	@Override
	public void beginTransaction() {
		if (!tx.isActive())
			tx.begin();
	}

	@Override
	public void commitTransaction() {
		tx.commit();
	}

	@Override
	public void rollbackTransaction() {
		tx.rollback();
	}

	@Override
	public void close() {
		session.close();
		sf.close();
	}

}
