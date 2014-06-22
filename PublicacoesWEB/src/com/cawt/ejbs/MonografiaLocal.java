package com.cawt.ejbs;

import java.util.Collection;

import com.cawt.entities.Monografia;

public interface MonografiaLocal {
    void persist(Monografia monografia);
 
    void merge(Monografia monografia);
 
    void remove(Monografia monografia);
 
    Collection<Monografia> findAll();
 
    Monografia getById(Long id);
}