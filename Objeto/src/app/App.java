package app;

import java.util.Scanner;

import model.Carlos;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int escolha = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Selecione o método do Carlos:");
		
		System.out.println("1 - Comida");
		System.out.println("2 - Dalva");
		
		try {
			escolha = Integer.parseInt(scanner.next());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		switch (escolha) {
		case 1:
			Carlos.comida();
			break;

		case 2:
			
			String adjetivo = null;
			String substantivo = null;
			
			System.out.println("Digite o adjetivo:");
			
			try {
				adjetivo = scanner.next();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("Digite o substantivo:");
			
			try {
				substantivo = scanner.next();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Carlos.dalva(adjetivo, substantivo);
			
			break;
		default:
			break;
		}
		
		scanner.close();

	}

}
