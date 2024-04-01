package br.senai.sp.jandira.model;

public class Aluno {

	public String nome;
	public String email;
	public byte idade;
	public String matricula;
	public double peso;
	public double altura;
	
	public double calcularImc() {
		return peso / (altura * altura);
	};
	
	public String cumprimentar() {
		return "Olá, tudo bem?";
	};
	
	public String status() {
		
		if (calcularImc() < 30) {
			if (calcularImc() < 18.5) {
				return "Abaixo do peso.";
			}
			else if (calcularImc() < 25) {
				return"Peso ideal (parabéns).";
			}
			else {
				return "Levemente acima do peso.";
			}
		}
		else {
			if (calcularImc() > 40) {
				return "Obesidade III (mórbida).";
			}
			else if (calcularImc() > 35) {
				return "Obesiade grau II (severa).";
			}
			
			else {
				return"Obesidade grau I.";
			}
		}
	};
	
	
}
