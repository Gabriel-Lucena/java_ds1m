package model;

public abstract class Forma {

	String cor;
	
	public void mostarCor() {
		System.out.println("Sua cor é " + cor + ".");
	}
	
	abstract void calcularArea();
}
