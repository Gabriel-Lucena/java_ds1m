package app;

import model.Quadrado;

public class App {
	
	public static void main(String[] args) {

		Quadrado square = new Quadrado(10, "Amarelo");
		
		square.calcularArea();
		square.mostarCor();
	}
}
