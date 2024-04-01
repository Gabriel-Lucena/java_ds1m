import java.util.Scanner;

public class Multiplicador {

	private static double d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);

		double number_one;
		double number_two;

		String Multiplication = "*";
		String Adition = "+";
		String Subtration = "-";
		String Division = "/";
		int operation;
		String sera = "Sim";
		String yes = "Sim";
		String no = "Não";

		while (sera == yes) {

			System.out.println("Queres calcular:");
			sera = reader.next();
			System.out.println("-------------");

			System.out.println("Operação:");
			System.out.println("-------------");
			System.out.println("1) Adição");
			System.out.println("2) Subtração");
			System.out.println("3) Multiplicação");
			System.out.println("4) Divisão");
			System.out.println("-------------");
			operation = reader.nextInt();
			System.out.println("-------------");

			if (operation == 1)	{

				System.out.println("Primeiro n�mero:");
				number_one = reader.nextDouble();

				System.out.println("Segundo n�mero:");
				number_two = reader.nextDouble();

				System.out.println("Resultado:");
				double result = number_one + number_two;
				System.out.println(result);
				
				System.out.println("-------------");

				System.out.println("Queres calcular:");
				sera = reader.next();

			} else if (operation == 2) {

				System.out.println("Primeiro n�mero:");
				number_one = reader.nextDouble();

				System.out.println("Segundo n�mero:");
				number_two = reader.nextDouble();

				System.out.println("Resultado:");
				double result = number_one - number_two;
				System.out.println(result);
				
				System.out.println("-------------");

				System.out.println("Queres calcular:");
				sera = reader.next();

			} else if (operation == 3) {

				System.out.println("Primeiro n�mero:");
				number_one = reader.nextDouble();

				System.out.println("Segundo n�mero:");
				number_two = reader.nextDouble();

				System.out.println("Resultado:");
				double result = number_one * number_two;
				System.out.println(result);
				
				System.out.println("-------------");

				System.out.println("Queres calcular:");
				sera = reader.next();

			} else {

				System.out.println("Primeiro n�mero:");
				number_one = reader.nextDouble();

				System.out.println("Segundo n�mero:");
				number_two = reader.nextDouble();

				System.out.println("Resultado:");
				double result = number_one / number_two;
				System.out.println(result);
				
				System.out.println("-------------");

				System.out.println("Queres calcular:");
				sera = reader.next();

			}

		}

		System.out.println("-------------");
		System.out.println("Programa terminado");
		System.out.println("-------------");







	}
}