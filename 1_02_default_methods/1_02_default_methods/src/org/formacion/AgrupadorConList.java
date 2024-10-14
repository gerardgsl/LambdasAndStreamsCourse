package org.formacion;

import java.util.ArrayList;
import java.util.List;

public class AgrupadorConList implements Agrupador {

	private List<Object> contenido = new ArrayList<>();
	
	// todo implementad los metodos de la interface usando la lista contenido
	@Override
	public void add(Object elemento) {
		contenido.add(elemento);
	}

	@Override
	public int numeroElementos() {
		// TODO Auto-generated method stub
		return contenido.size();
	}

}
