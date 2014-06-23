package com.cawt.dao;

import java.util.HashMap;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.cawt.entities.Autor;

@FacesConverter("com.cawt.dao.ObjectConverter")
public class ObjectConverter implements Converter {

    private static HashMap<String, Autor> map = new HashMap<String, Autor>();
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Autor autor = map.get(value);
		System.out.println(value);
		return autor;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return null;
/*        Autor autor= (Autor)value;
        map.put(autor.getId().toString(), autor);
		return autor.getId().toString();*/
	}

}
