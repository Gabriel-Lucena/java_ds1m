package model;

public class Quadrado extends Forma {
	
	double lado;
	
	public Quadrado(double lado, String cor) {
	this.lado = lado;
	this.cor = cor;
	}
	
	public void calcularArea() {
		double area = lado * lado;
		
		System.out.println("Cálculo específico de quadrado " + Math.round(area) + ".");
	}
}
