package co.edu.unbosque.controller;

import java.util.ArrayList;

import co.edu.unbosque.model.Model;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Model model;
	private ArrayList<String> listaCaracteres;

	public Controller () {
		view = new View();
		model = new Model();
		listaCaracteres = new ArrayList<String>();
		funcionar();
	}

	public void funcionar() {

		agregarPalabrasALista(" ");
		agregarPalabrasALista(" ");
		agregarPalabrasALista(" ");
		agregarPalabrasALista(" ");
		agregarPalabrasALista(" ");

		String ej7 = ejercicio7(model.getCadenaCaracteres());
		view.mostrarinfo(ej7);

	}

	public void agregarPalabrasALista(String nombre) {

		view.mostrarinfo("Escriba las palabras y al final se retornarán aquellas que inicien con una vocal");
		nombre = view.leerTexto();
		listaCaracteres.add(nombre);		

	}

	public String ejercicio7(String letra) {
		String resp = "";
		for (int i = 0; i < listaCaracteres.size(); i++) {
			String nombre= listaCaracteres.get(i);
			for (int j = 0; j < nombre.length(); j++) {
				if(nombre.charAt(0)== 'A'||nombre.charAt(0)== 'E'||nombre.charAt(0)== 'I'||nombre.charAt(0)== 'O'||nombre.charAt(0)== 'U'||nombre.charAt(0)== 'a'||nombre.charAt(0)== 'e'||nombre.charAt(0)== 'i'||nombre.charAt(0)== 'o'||nombre.charAt(0)== 'u') {
					resp += nombre +"\n";
				}
			}
		}
		return resp;
	}


}
