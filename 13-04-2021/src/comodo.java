import java.util.Scanner;

public class comodo {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		String resposta = "N�o";
		String comodo;
		int largura;
		int comprimento;
		int area;
		int areaFinal = 0;
		
		System.out.println("Cadastrar um quarto?");
		resposta = reader.next();
		
		for (int cont = 0; resposta.equals("Sim");) {
			
			System.out.println("Nome do c�modo:");
			comodo = reader.next();
			
			System.out.println("Qual � a largura?");
			largura = reader.nextInt();
			
			System.out.println("Qual � a altura?");
			comprimento = reader.nextInt();
			
			area = comprimento * largura;
			cont = cont + area;
			areaFinal = cont;
			
			System.out.println("Cadastrar mais um quarto?");
			resposta = reader.next();
			
		}
		
		System.out.printf("A �rea total de sua casa � de %s metros quadrados.", areaFinal);

	}

}
