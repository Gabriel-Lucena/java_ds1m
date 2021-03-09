import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {

	public static void main(String[] args) {

		Random escolha = new Random();
		Scanner leitor = new Scanner(System.in);

		int escolhaJogador;
		int escolhaComputador;

		System.out.println("Escolha uma opção:");
		System.out.println("0 --> Pedra");
		System.out.println("1 --> Papel");
		System.out.println("2 --> Tesoura");
		System.out.print("Qual é a tua opção? ");

		escolhaJogador = leitor.nextInt();
		escolhaComputador = escolha.nextInt(3);

		if (escolhaJogador == 0)
			{if (escolhaComputador == 0)
				{System.out.print("Empate");
				System.out.print(", pedra contra pedra.");}
			else if (escolhaComputador == 1)
				{System.out.print("Perdeu");
				System.out.print(", pedra contra papel.");}
			else if (escolhaComputador == 2)
				{System.out.print("Ganhou");
				System.out.print(", pedra contra tesoura.");}
			}
		else if (escolhaJogador == 1)
			{if (escolhaComputador == 0)
				{System.out.print("Ganhou");
				System.out.print(", papel contra pedra.");}
			else if (escolhaComputador == 1)
				{System.out.print("Empate");
				System.out.print(", papel contra papel.");}
			else if (escolhaComputador == 2)
				{System.out.print("Perdeu");
				System.out.print(", papel contra tesoura.");}
				}
		else if (escolhaJogador == 2)
			{if (escolhaComputador == 0)
				{System.out.print("Perdeu");
				System.out.print(", tesoura contra pedra.");}
			else if (escolhaComputador == 1)
				{System.out.print("Ganhou");
				System.out.print(", tesoura contra papel.");}
			else if (escolhaComputador == 2)
				{System.out.println("Empate");
				System.out.print(", tesoura contra tesoura.");}
				}
}
}
