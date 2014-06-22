package com.cawt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AcessoUsuario {
	@Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;	
	
	private String nomeUsuario;
	 
	private String senha;
	 
	private String perfilAcesso;

	 
}
 
