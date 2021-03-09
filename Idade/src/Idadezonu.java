import java.util.Scanner;

public class Idadezonu {

	public static void main(String[] args) {
	
	byte idade;
	String nome;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Qual a sua idade? ");
	idade = leitor.nextByte();
	
	System.out.print("Qual o seu nome? ");
	nome = leitor.next();
	
	System.out.print(nome + " você tem " + idade + " anos!");
	
	}

}
