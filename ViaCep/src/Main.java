
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu CEP (somente os números):");
		
		String cep = "";
		
		try {
			cep = scanner.next();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		scanner.close();

		ViaCep viacep = new ViaCep(cep);
		
		System.out.println(viacep.getAddress());

	}

}
