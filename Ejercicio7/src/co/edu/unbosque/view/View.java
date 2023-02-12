package co.edu.unbosque.view;

import java.util.Scanner;

public class View {

		private Scanner leer;
		
		public View() {
			leer = new Scanner (System.in);
		}
		public void mostrarinfo(String mensaje) {
			System.out.println(mensaje);
		}
		public String leerTexto() {
			return leer.nextLine();
		}
	
}
