package com.cawt.ejbs;

import java.util.Collection;

import com.cawt.entities.Publicacao;
 
public interface PublicacaoLocal {
    void persist(Publicacao publicacao);
 
    void merge(Publicacao publicacao);
 
    void remove(Publicacao publicacao);
 
    Collection<Publicacao> findAll();
 
    Publicacao getById(Long id);
}