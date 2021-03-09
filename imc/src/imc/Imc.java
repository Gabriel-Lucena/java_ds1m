package imc;

public class Imc {

	public static void main(String[] args) {
		
		float peso = 65f;
		float altura = 1.9f;
		float imc;
		
		imc = peso / (altura * altura);
		
		System.out.print(imc);
		
}
}