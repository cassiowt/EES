package com.cawt.ejbs;

import java.io.Serializable;
import java.util.Collection;
 
import javax.ejb.Stateless;
//import javax.ejb.TransactionManagement;
import javax.inject.Inject;
 
import com.cawt.dao.PublicacaoDAO;
import com.cawt.ejbs.PublicacaoLocal;
import com.cawt.entities.Publicacao;
 
@Stateless
public class PublicacaoBean implements Serializable, PublicacaoLocal {
    private static final long serialVersionUID = 1642656616642654056L;
 
    @Inject
    private PublicacaoDAO dao;
 
    public void persist(Publicacao cliente) {
        validarCliente(cliente);
        dao.persist(cliente);
    }
 
    public void merge(Publicacao cliente) {
        validarCliente(cliente);
        dao.merge(cliente);
    }
 
    public void remove(Publicacao publicacao) {
        if (publicacao.getId() == 0 || publicacao.getId() == null) {
            throw new IllegalArgumentException(
                    "Campo id não pode ser nulo ou vazio");
        }
 
        dao.removeById(publicacao.getId());
    }
 
    public Collection<Publicacao> findAll() {
        return dao.findAll();
    }
 
    public Publicacao getById(Long id) {
        if (id == 0 || id == null) {
            throw new IllegalArgumentException(
                    "Campo id não pode ser nulo ou vazio");
        }
 
        return dao.getById(id);
    }
 
    private void validarCliente(Publicacao publicacao) {
        if ("".equals(publicacao.getTitulo()) || publicacao.getTitulo() == null) {
            throw new IllegalArgumentException(
                    "Campo titulo não pode ser nulo ou vazio");
        }
        if ("".equals(publicacao.getData()) || publicacao.getData() == null) {
            throw new IllegalArgumentException(
                    "Campo profissão não pode ser nulo ou vazio");
        }
        if ("".equals(publicacao.getSubtitulo()) || publicacao.getSubtitulo() == null) {
            throw new IllegalArgumentException(
                    "Campo subtitulo não pode ser nulo ou vazio");
        }
     /*   if (publicacao.getIdade().equals(0) || publicacao.getIdade() == null) {
            throw new IllegalArgumentException(
                    "Campo idade não pode ser nulo ou vazio");
        }*/
    }
}
