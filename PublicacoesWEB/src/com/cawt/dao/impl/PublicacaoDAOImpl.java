package com.cawt.dao.impl;

import java.io.Serializable;

import javax.ejb.Stateless;

import com.cawt.dao.PublicacaoDAO;
import com.cawt.entities.Publicacao;
 
@Stateless
public class PublicacaoDAOImpl extends GenericDAOImpl<Publicacao, Long> implements
        Serializable, PublicacaoDAO {
	private static final long serialVersionUID = 8595035158134084806L;
   
}
