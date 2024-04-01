import java.util.Scanner;

public class comodo {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		String resposta = "Não";
		String comodo;
		int largura;
		int comprimento;
		int area;
		int areaFinal = 0;
		
		System.out.println("Cadastrar um quarto?");
		resposta = reader.next();
		
		for (int cont = 0; resposta.equals("Sim");) {
			
			System.out.println("Nome do cômodo:");
			comodo = reader.next();
			
			System.out.println("Qual é a largura?");
			largura = reader.nextInt();
			
			System.out.println("Qual é a altura?");
			comprimento = reader.nextInt();
			
			area = comprimento * largura;
			cont = cont + area;
			areaFinal = cont;
			
			System.out.println("Cadastrar mais um quarto?");
			resposta = reader.next();
			
		}
		
		System.out.printf("A área total de sua casa é de %s metros quadrados.", areaFinal);

	}

}
