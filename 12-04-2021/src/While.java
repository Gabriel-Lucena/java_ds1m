import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner yago = new Scanner(System.in);
		int a = 0;
		
		while (a < 10 ) {
			System.out.print("Digite um número:");
			a = yago.nextInt();
			System.out.println("Você digitou: " + a);
		}
		
	}

}
