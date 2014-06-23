package com.cawt.managetbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;

import com.cawt.ejbs.MonografiaLocal;
import com.cawt.entities.Monografia;

 
@Named
@RequestScoped
public class GerenciamentoMonografiasMB implements Serializable {
    private static final long serialVersionUID = 1880935315548336037L;
 
    @Inject
    private MonografiaLocal bean;
 
    private Monografia monografia;
 
    private List<Monografia> monografias;
 
    @PostConstruct
    private void init() {
        monografias = (List<Monografia>) bean.findAll();
        monografia = new Monografia();
    }
 
    public String cadastrar() {
        try {
            bean.persist(monografia);
            monografias = (List<Monografia>) bean.findAll();
            addMessage("Monografia " + monografia.getTitulo()+ " Cadastrado!" + monografia.getAutor());
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
 
        return "";
    }
 
    public String atualizar() {
        try {
            bean.merge(monografia);
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
 
        return "";
    }
 
    public void excluir() {
        try {
            bean.remove(monografia);
            monografias = (List<Monografia>) bean.findAll();
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
    }
 
    public void onEdit(RowEditEvent event) {
        monografia = (Monografia) event.getObject();
        atualizar();
        addMessage("Monografia " + monografia.getTitulo()+ " atualizado!");
    }
 
    private void addMessage(String message) {
        FacesMessage msg = new FacesMessage(message);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public Monografia getMonografia() {
        return monografia;
    }
 
    public void setMonografia(Monografia monografia) {
        this.monografia = monografia;
    }
 
    public List<Monografia> getMonografias() {
        return monografias;
    }
 
    public void setMonografias(List<Monografia> monografias) {
        this.monografias = monografias;
    }
    
    public void viewLogin() {
        RequestContext.getCurrentInstance().openDialog("login");
    }

}
