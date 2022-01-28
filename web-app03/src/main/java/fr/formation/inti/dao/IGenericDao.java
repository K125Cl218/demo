package fr.formation.inti.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import fr.formation.inti.entity.Employee;
import fr.formation.inti.utils.HibernateUtils;

public interface IGenericDao<T, I extends Serializable> {
	
	final SessionFactory sf = HibernateUtils.getSessionFactory();
	final Session session = sf.getCurrentSession();
	final Transaction tx = session.getTransaction();
	
	void beginTransaction();
	void commitTransaction();
	void rollbackTransaction();
	void close();
	
	I save(T t);
	void update(T t);
	void delete(T t);
	T findById(I i);
	List<T> findAll();
	
	
}
