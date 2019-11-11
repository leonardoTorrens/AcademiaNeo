package ar.com.softtek.academia.backend.bo.impl;

import java.util.List;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.BusinessException;
import ar.com.academia.entities.excepciones.PersistenceException;
import ar.com.softtek.academia.backend.bo.SocioBO;
import ar.com.softtek.academia.backend.dao.GenericDAO;

public class SocioBOImpl implements SocioBO {

	private GenericDAO<Socio> socioDAO;

	public GenericDAO<Socio> getSocioDAO() {
		return socioDAO;
	}

	public void setSocioDAO(GenericDAO<Socio> socioDAO) {
		this.socioDAO = socioDAO;
	}

	@Override
	public List<Socio> getAllSocios() throws BusinessException {
		try {
			List<Socio> list = socioDAO.getAll();
			return list;
		} catch (PersistenceException e) {
			throw new BusinessException(e);
		}
	}

	@Override
	public Socio getSocioById(int id) throws BusinessException {
		try {
			Socio socio = socioDAO.getById(id);
			return socio;
		} catch (PersistenceException e) {
			throw new BusinessException(e);
		}
	}

	@Override
	public void crearSocio(Socio socio) throws BusinessException {
		try {
			socioDAO.save(socio);
		} catch (PersistenceException e) {
			throw new BusinessException(e);
		}
	}

	@Override
	public void actualizarSocio(Socio socio) throws BusinessException {
		try {
			socioDAO.update(socio);
			//return true;
		} catch (PersistenceException e) {
			throw new BusinessException(e);
		}

	}

	@Override
	public boolean borrarSocio(Socio socio) throws BusinessException {
		try {
			boolean aux = socioDAO.delete(socio);
			return aux;
		} catch (PersistenceException e) {
			e.printStackTrace();
			throw new BusinessException(e);
		}
	}

	@Override
	public boolean borrarSocio(int id) throws BusinessException {
		try {
			boolean aux = socioDAO.delete(id);
			return aux;
		} catch (PersistenceException e) {
			e.printStackTrace();
			throw new BusinessException(e);
		}
	}

}
