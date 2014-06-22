package com.cawt.ejbs;

import java.io.Serializable;
import java.util.Collection;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.cawt.dao.AutorDAO;
import com.cawt.entities.Autor;

@Stateless
public class AutorBean implements Serializable, AutorLocal {
	private static final long serialVersionUID = 8740648523163599995L;

	@Inject
    private AutorDAO dao;
 
    public void persist(Autor e) {
        validar(e);
        dao.persist(e);
    }
 
    public void merge(Autor e) {
        validar(e);
        dao.merge(e);
    }
 
    public void remove(Autor e) {
        if (e.getId() == 0 || e.getId() == null) {
            throw new IllegalArgumentException(
                    "Campo id não pode ser nulo ou vazio");
        }
 
        dao.removeById(e.getId());
    }
 
    public Collection<Autor> findAll() {
        return dao.findAll();
    }
 
    public Autor getById(Long id) {
        if (id == 0 || id == null) {
            throw new IllegalArgumentException(
                    "Campo id não pode ser nulo ou vazio");
        }
 
        return dao.getById(id);
    }
 
    private void validar(Autor e) {
        if ("".equals(e.getNome()) || e.getNome() == null) {
            throw new IllegalArgumentException(
                    "Campo Nome não pode ser nulo ou vazio");
        }
      
     /*   if (publicacao.getIdade().equals(0) || publicacao.getIdade() == null) {
            throw new IllegalArgumentException(
                    "Campo idade não pode ser nulo ou vazio");
        }*/
    }
 
    
}
