import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {

	public static void main(String[] args) {

		Random escolha = new Random();
		Scanner leitor = new Scanner(System.in);

		int escolhaJogador;
		int escolhaComputador;
		String user = "";

		System.out.println("Escolha uma opção:");
		System.out.println("--------------------");
		System.out.println("    0 --> Pedra");
		System.out.println("    1 --> Papel");
		System.out.println("    2 --> Tesoura");
		System.out.println("--------------------");
		System.out.println("Qual é a tua opção? ");
		
		escolhaComputador = escolha.nextInt(3);
		escolhaJogador = leitor.nextInt();
		
		System.out.println("--------------------");
		
		System.out.println("Seu nome:");
		user = leitor.next();
		
		System.out.println("--------------------");
		
		if (escolhaJogador == 0)
			{if (escolhaComputador == 0)
				{System.out.println("Empate, pedra contra pedra.");
				System.out.print(user + " escolheu pedra e o computador também.");}
			else if (escolhaComputador == 1)
				{System.out.println("Perdeu, pedra contra papel.");
				System.out.print(user + " escolheu pedra e o computador escolheu papel.");}
			else if (escolhaComputador == 2)
				{System.out.println("Ganhou, pedra contra tesoura.");
				System.out.print(user + " escolheu pedra e o computador escolheu tesoura.");}
			}
		else if (escolhaJogador == 1)
			{if (escolhaComputador == 0)
				{System.out.println("Ganhou, papel contra pedra");
				System.out.print(user + " escolheu papel e o computador escolheu pedra.");}
			else if (escolhaComputador == 1)
				{System.out.println("Empate, papel contra papel");
				System.out.print(user + " escolheu papel e o computador tamb�m escolheu papel.");}
			else if (escolhaComputador == 2)
				{System.out.println("Perdeu, papel contra tesoura.");
				System.out.print(user + " escolheu papel e o computador escolheu tesoura.");}
				}
		else if (escolhaJogador == 2)
			{if (escolhaComputador == 0)
				{System.out.println("Perdeu, tesoura contra pedra.");
				System.out.print(user + " escolheu tesoura e o computador escolheu pedra.");}
			else if (escolhaComputador == 1)
				{System.out.println("Ganhou, tesoura contra papel.");
				System.out.print(user + " escolheu tesoura e o computador escolheu papel.");}
			else if (escolhaComputador == 2)
				{System.out.println("Empate, tesoura contra tesoura.");
				System.out.print(user + " escolheu tesoura e o computador tamb�m escolheu tesoura.");}
				}
}
}
