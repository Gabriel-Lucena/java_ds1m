import java.util.Scanner;

public class retornoImc {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		double weight;
		double height;
		
		System.out.printf("Digite seu peso:%n");
		weight = reader.nextDouble();
		System.out.printf("Digite sua altura:%n");
		height = reader.nextDouble();
		System.out.printf("-------------------%n");
		
		double imc = calcularImc(weight,height);
		String indice = status(imc);
		
		System.out.println(indice);
		
	}

	public static double calcularImc(double weight, double height) {
		
		double imc = weight / (height * height);
		return imc;
	}
	
	public static String status(double imc) {
		
		if (imc < 30) {
			if (imc < 18.5) {
				return "Abaixo do peso.";
			}
			else if (imc < 25) {
				return"Peso ideal (parabéns).";
			}
			else {
				return "Levemente acima do peso.";
			}
		}
		else {
			if (imc > 40) {
				return "Obesidade III (mórbida).";
			}
			else if (imc > 35) {
				return "Obesiade grau II (severa).";
			}
			
			else {
				return"Obesidade grau I.";
			}
		}
	}
}
