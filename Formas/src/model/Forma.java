package model;

public abstract class Forma {

	String cor;
	
	public void mostarCor() {
		System.out.println("Sua cor � " + cor + ".");
	}
	
	abstract void calcularArea();
}
