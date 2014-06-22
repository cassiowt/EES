package com.cawt.dao.impl;

import java.io.Serializable;

import javax.ejb.Stateless;

import com.cawt.dao.AutorDAO;
import com.cawt.entities.Autor;

@Stateless
public class AutorDAOImpl extends GenericDAOImpl<Autor, Long> implements
        Serializable, AutorDAO {
	private static final long serialVersionUID = 957432047260147104L;
}
