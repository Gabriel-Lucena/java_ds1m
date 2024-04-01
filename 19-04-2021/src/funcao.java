import java.util.Scanner;

public class funcao {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		double a;
		double b;
		int operacao;
		
		System.out.println("Digite o primeiro n�mero:");
		a = reader.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		b = reader.nextDouble();
		System.out.println("---------------------");
		System.out.println("Escolha sua opera��o:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("---------------------");
		operacao = reader.nextInt();
		System.out.println("---------------------");
		
		if (operacao == 1) {
			
			somar(a,b);
			}
		else if (operacao == 2) {
			if (a < b) {
				subtrair(b,a);
				}
			else {
				subtrair(a,b);
				}
			}
		else if (operacao == 3) {
			multiplicar(a,b);
			}
		else if (operacao == 4) {
			if (a < b) {
				dividir(b,a);
				}
			else {
				dividir(a,b);
				}
			
			}
		else {
			System.out.println("Insira um n�mero v�lido.");
		}
	}
	
	public static void somar(double valor1, double valor2) {
		
		double resultado = valor1 + valor2;
		System.out.println("Resultado: " + resultado);
		
	}
	
	public static void subtrair(double valor1, double valor2) {
		
		double resultado = valor1 - valor2;
		System.out.println("Resultado: " + resultado);
		
	}
	
	public static void multiplicar(double valor1, double valor2) {
		
		double resultado = valor1 * valor2;
		System.out.println("Resultado: " + resultado);
		
	}
	
	public static void dividir(double valor1, double valor2) {
		
		double resultado = valor1 / valor2;
		System.out.println("Resultado: " + resultado);
		
	}
	
}
