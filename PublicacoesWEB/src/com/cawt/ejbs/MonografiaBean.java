package com.cawt.ejbs;

import java.io.Serializable;
import java.util.Collection;

import javax.ejb.Stateless;
//import javax.ejb.TransactionManagement;
import javax.inject.Inject;

import com.cawt.dao.MonografiaDAO;
import com.cawt.entities.Monografia;

@Stateless
public class MonografiaBean implements Serializable, MonografiaLocal {
    private static final long serialVersionUID = 1642656616642654056L;
 
    @Inject
    private MonografiaDAO dao;
 
    public void persist(Monografia e) {
        validarCliente(e);
        dao.persist(e);
    }
 
    public void merge(Monografia e) {
        validarCliente(e);
        dao.merge(e);
    }
 
    public void remove(Monografia e) {
        if (e.getId() == 0 || e.getId() == null) {
            throw new IllegalArgumentException(
                    "Campo id não pode ser nulo ou vazio");
        }
 
        dao.removeById(e.getId());
    }
 
    public Collection<Monografia> findAll() {
        return dao.findAll();
    }
 
    public Monografia getById(Long id) {
        if (id == 0 || id == null) {
            throw new IllegalArgumentException(
                    "Campo id não pode ser nulo ou vazio");
        }
 
        return dao.getById(id);
    }
 
    private void validarCliente(Monografia e) {
        if ("".equals(e.getTitulo()) || e.getTitulo() == null) {
            throw new IllegalArgumentException(
                    "Campo titulo não pode ser nulo ou vazio");
        }
        if ("".equals(e.getData()) || e.getData() == null) {
            throw new IllegalArgumentException(
                    "Campo data não pode ser nulo ou vazio");
        }
        if ("".equals(e.getSubtitulo()) || e.getSubtitulo() == null) {
            throw new IllegalArgumentException(
                    "Campo subtitulo não pode ser nulo ou vazio");
        }
     /*   if (publicacao.getIdade().equals(0) || publicacao.getIdade() == null) {
            throw new IllegalArgumentException(
                    "Campo idade não pode ser nulo ou vazio");
        }*/
    }
    
    
    
}
