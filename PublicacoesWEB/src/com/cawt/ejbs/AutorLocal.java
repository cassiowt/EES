package com.cawt.ejbs;

import java.util.Collection;

import com.cawt.entities.Autor;
 
public interface AutorLocal {
    void persist(Autor autor);
 
    void merge(Autor autor);
 
    void remove(Autor autor);
 
    Collection<Autor> findAll();
 
    Autor getById(Long id);
}