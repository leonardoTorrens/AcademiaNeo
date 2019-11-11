package ar.com.softtek.academia.backend.dao.impl;

import java.util.List;

import javax.imageio.spi.ServiceRegistry;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.academia.entities.excepciones.PersistenceException;
import ar.com.softtek.academia.backend.dao.GenericDAO;

public abstract class GenericDAOImpl<T> extends HibernateDaoSupport implements GenericDAO<T> {
	private Class<T>type=null;
	
	public Class<T> getType() {
		return type;
	}

	public void setType(Class<T> type) {
		this.type = type;
	}
	
	@Override
	public boolean delete(int id) throws PersistenceException {
		try{
			T elemento = this.getHibernateTemplate().get(this.getType(), id);
			this.getHibernateTemplate().delete(elemento);
			return true;
		}catch(DataAccessException e){
			throw new PersistenceException(e);
		}
	}

	@Override
	public int count() throws PersistenceException {
		return 0;
//		try{
//			Session sesion = this.getSessionFactory().getCurrentSession();
//			Criteria criteria = sesion.createCriteria(this.getType());
//			criteria.setProjection(Projections.rowCount());
//			List result = criteria.list();
//			return (int) result.get(0);
//		}catch(DataAccessException e){
//			throw new PersistenceException(e);
//		}
	}

	@Override
	public void update(T entidad) throws PersistenceException {
		try{
			this.getHibernateTemplate().update(entidad);
		}catch(DataAccessException e){
			throw new PersistenceException(e);
		}
		
	}

	@Override
	public boolean delete(T entidad) throws PersistenceException {
		try{
			this.getHibernateTemplate().delete(entidad);
			return true;
		}catch(DataAccessException e){
			throw new PersistenceException(e);
		}
	}

	@Override
	public List<T> getAll() throws PersistenceException {
		try{
			List<T> result = this.getHibernateTemplate().loadAll(this.getType());
			return result;
		}catch(DataAccessException e){
			throw new PersistenceException(e);
		}
	}

	@Override
	public T getById(int id) throws PersistenceException {
		try{
			T result = this.getHibernateTemplate().get(this.getType(), id);
			return result;
		}catch(DataAccessException e){
			throw new PersistenceException(e);
		}
	}

	@Override
	public void save(T entidad) throws PersistenceException {
		try{
			this.getHibernateTemplate().save(entidad);
		}catch(DataAccessException e){
			throw new PersistenceException(e);
		}
		
	}



}
