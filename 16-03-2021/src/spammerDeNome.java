import java.util.Scanner;

public class spammerDeNome{
	
	public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	int numeroDeRepeticoes;
	int inicial = 0;
	String nome;
	
	System.out.println("Qual é o teu nome?");
	nome = reader.next();
	System.out.print("Número de repetições:");
	numeroDeRepeticoes = reader.nextInt();
	
	while (inicial <= numeroDeRepeticoes - 1) {
		System.out.println(nome);
		inicial = inicial + 1;
		
	}
	
}
}