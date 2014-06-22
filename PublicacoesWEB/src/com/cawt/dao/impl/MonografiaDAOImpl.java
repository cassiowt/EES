package com.cawt.dao.impl;

import java.io.Serializable;

import javax.ejb.Stateless;

import com.cawt.dao.MonografiaDAO;
import com.cawt.entities.Monografia;

@Stateless
public class MonografiaDAOImpl extends GenericDAOImpl<Monografia, Long> implements
        Serializable, MonografiaDAO {
	private static final long serialVersionUID = 4205430433082639817L;
	
   
}
