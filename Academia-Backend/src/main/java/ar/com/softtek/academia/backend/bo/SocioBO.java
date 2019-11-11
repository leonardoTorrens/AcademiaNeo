package ar.com.softtek.academia.backend.bo;

import java.util.List;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.BusinessException;

public interface SocioBO {
	
	List<Socio>getAllSocios() throws BusinessException;
	
	Socio getSocioById(int id)throws BusinessException;
	
	void crearSocio(Socio socio)throws BusinessException;
	
	void actualizarSocio(Socio socio)throws BusinessException;
	
	boolean borrarSocio(Socio socio)throws BusinessException;
	
	boolean borrarSocio(int id)throws BusinessException;
	
}
