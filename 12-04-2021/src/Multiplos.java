import java.util.Scanner;

public class Multiplos {

		public static void main(String[] args) {
			
			int opa;
			int cont = 0;
			Scanner re = new Scanner (System.in);
			System.out.println("Digite um número:");
			opa = re.nextInt();
			
			while (cont < 16) {
				System.out.println(opa + " x " + cont + " = " + cont * opa);
				cont + 1;
			}
			
			
		}
}
