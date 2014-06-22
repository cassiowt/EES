package com.cawt.managetbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;

import com.cawt.ejbs.AutorLocal;
import com.cawt.entities.Autor;

 
@Named
@SessionScoped
public class GerenciamentoAutorMB implements Serializable {

	private static final long serialVersionUID = 6381235301296269268L;

	@Inject
    private AutorLocal bean;
 
    private Autor autor;
 
    private List<Autor> autores;
 
    @PostConstruct
    private void init() {
        autores = (List<Autor>) bean.findAll();
        autor = new Autor();
    }
 
    public String cadastrar() {
        try {
            bean.persist(autor);
            autores = (List<Autor>) bean.findAll();
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
 
        return "";
    }
 
    public String atualizar() {
        try {
            bean.merge(autor);
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
 
        return "";
    }
 
    public void excluir() {
        try {
            bean.remove(autor);
            autores = (List<Autor>) bean.findAll();
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
    }
 
    public void onEdit(RowEditEvent event) {
        autor = (Autor) event.getObject();
        atualizar();
        addMessage("Autor " + autor.getNome()+ " atualizado!");
    }
 
    private void addMessage(String message) {
        FacesMessage msg = new FacesMessage(message);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public Autor getAutor() {
        return autor;
    }
 
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
 
    public List<Autor> getAutores() {
        return autores;
    }
 
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

}
