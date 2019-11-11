package ar.com.softtek.academia.backend.dao.impl;

import java.util.List;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.PersistenceException;
import ar.com.softtek.academia.backend.dao.SocioDAO;

public class SocioDAOImpl extends GenericDAOImpl<Socio> implements SocioDAO {


	@Override
	public List<Socio> getAll() throws PersistenceException {
		List<Socio> lista = super.getAll();
		return lista;
	}

	@Override
	public Socio getById(int id) throws PersistenceException {
		Socio socio = super.getById(id);
		return socio;
	}

	@Override
	public void save(Socio entidad) throws PersistenceException {
		super.save(entidad);
		
	}

	@Override
	public void update(Socio entidad) throws PersistenceException {
		super.update(entidad);
		
	}

	@Override
	public boolean delete(Socio entidad) throws PersistenceException {
		boolean result = super.delete(entidad);
		return result;
	}

	@Override
	public boolean delete(int id) throws PersistenceException {
		boolean result = super.delete(id);
		return result;
	}

	@Override
	public int count() throws PersistenceException {
		return 0;
	}
	
	@Override
	public Class<Socio>getType(){
		return Socio.class;
	}
}
