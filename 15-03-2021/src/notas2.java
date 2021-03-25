import java.util.Scanner;

public class notas2 {

	public static void main(String[] args) {
		
		double nota_1, nota_2,nota_3, nota_4, media;
		String nomeDoAluno;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Seu nome:");
		nomeDoAluno = leitor.next();
		System.out.println("Nota do primeiro bimestre:");
		nota_1 = leitor.nextDouble();
		System.out.println("Nota do segundo bimestre:");
		nota_2 = leitor.nextDouble();
		System.out.println("Nota do terceiro bimestre:");
		nota_3 = leitor.nextDouble();
		System.out.println("Nota do quarto bimestre:");
		nota_4 = leitor.nextDouble();
		
		media = (nota_1 + nota_2 + nota_3 + nota_4) / 4;
		
		if (media < 4) {
			System.out.print("O aluno " + nomeDoAluno + " foi REPROVADO!!");
		}
		else if ((media >= 4)&&(media < 6)) {
			System.out.print("O aluno " + nomeDoAluno + " ficou de recuperação");
		}
		else {
			System.out.print("O aluno " + nomeDoAluno + " foi aprovado");
		}
		

	}
	}
		
