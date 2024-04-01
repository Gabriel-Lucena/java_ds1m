import java.util.Scanner;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
	
		Random choice = new Random();
		Scanner reader = new Scanner(System.in);
		
		int choiceComp;
		int choicePla;
		String user;
		
		System.out.println("Escolha uma opção:");
		System.out.println("--------------------");
		System.out.println("    0 --> Pedra");
		System.out.println("    1 --> Fogo");
		System.out.println("    2 --> Tesoura");
		System.out.println("    3 --> Cobra");
		System.out.println("    4 --> Humano");
		System.out.println("    5 --> Árvore");
		System.out.println("    6 --> Lobo");
		System.out.println("    7 --> Esponja");
		System.out.println("    8 --> Papel");
		System.out.println("    9 --> Ar");
		System.out.println("    10 --> Água");
		System.out.println("    11 --> Dragão");
		System.out.println("    12 --> Demônio");
		System.out.println("    13 --> Trovão");
		System.out.println("    14 --> Arma");
		System.out.println("--------------------");
		System.out.println("Qual é a tua opção? ");
		
		choiceComp = choice.nextInt(15);
		choicePla = reader.nextInt();
		
		System.out.println("--------------------");
		
		System.out.println("Seu nome:");
		user = reader.next();
		
		System.out.println("--------------------");
		
		if (choicePla == 0) { //pedra
			if (choiceComp == 0) { //pedra
				System.out.println("Empatou, pedra contra pedra.");
				System.out.print(user + " escolheu pedra e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, pedra contra fogo.");
				System.out.print(user + " escolheu pedra e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, pedra contra tesoura.");
				System.out.print(user + " escolheu pedra e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, pedra contra cobra.");
				System.out.print(user + " escolheu pedra e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, pedra contra humano.");
				System.out.print(user + " escolheu pedra e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Ganhou, pedra contra árvore.");
				System.out.print(user + " escolheu pedra e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Ganhou, pedra contra lobo.");
				System.out.print(user + " escolheu pedra e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Ganhou, pedra contra esponja.");
				System.out.print(user + " escolheu pedra e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, pedra contra papel.");
				System.out.print(user + " escolheu pedra e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, pedra contra ar.");
				System.out.print(user + " escolheu pedra e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Perdeu, pedra contra água.");
				System.out.print(user + " escolheu pedra e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Perdeu, pedra contra dragão.");
				System.out.print(user + " escolheu pedra e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Perdeu, pedra contra demônio.");
				System.out.print(user + " escolheu pedra e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Perdeu, pedra contra trovão.");
				System.out.print(user + " escolheu pedra e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Perdeu, pedra contra arma.");
				System.out.print(user + " escolheu pedra e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 1) { //fogo
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, fogo contra pedra.");
				System.out.print(user + " escolheu fogo e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Empatou, fogo contra fogo.");
				System.out.print(user + " escolheu fogo e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, fogo contra tesoura.");
				System.out.print(user + " escolheu fogo e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, fogo contra cobra.");
				System.out.print(user + " escolheu fogo e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, fogo contra humano.");
				System.out.print(user + " escolheu fogo e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Ganhou, fogo contra árvore.");
				System.out.print(user + " escolheu fogo e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Ganhou, fogo contra lobo.");
				System.out.print(user + " escolheu fogo e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Ganhou, fogo contra esponja.");
				System.out.print(user + " escolheu fogo e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Ganhou, fogo contra papel.");
				System.out.print(user + " escolheu fogo e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, fogo contra ar.");
				System.out.print(user + " escolheu fogo e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Perdeu, fogo contra água.");
				System.out.print(user + " escolheu fogo e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Perdeu, fogo contra dragão.");
				System.out.print(user + " escolheu fogo e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Perdeu, fogo contra demônio.");
				System.out.print(user + " escolheu fogo e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Perdeu, fogo contra trovão.");
				System.out.print(user + " escolheu fogo e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Perdeu, fogo contra arma.");
				System.out.print(user + " escolheu fogo e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 2) { //tesoura
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, tesoura contra pedra.");
				System.out.print(user + " escolheu tesoura e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Perdeu, tesoura contra fogo.");
				System.out.print(user + " escolheu tesoura e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Empatou, tesoura contra tesoura.");
				System.out.print(user + " escolheu tesoura e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, tesoura contra cobra.");
				System.out.print(user + " escolheu tesoura e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, tesoura contra humano.");
				System.out.print(user + " escolheu tesoura e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Ganhou, tesoura contra árvore.");
				System.out.print(user + " escolheu tesoura e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Ganhou, tesoura contra lobo.");
				System.out.print(user + " escolheu tesoura e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Ganhou, tesoura contra esponja.");
				System.out.print(user + " escolheu tesoura e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Ganhou, tesoura contra papel.");
				System.out.print(user + " escolheu tesoura e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Ganhou, tesoura contra ar.");
				System.out.print(user + " escolheu tesoura e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Perdeu, tesoura contra água.");
				System.out.print(user + " escolheu tesoura e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Perdeu, tesoura contra dragão.");
				System.out.print(user + " escolheu tesoura e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Perdeu, tesoura contra demônio.");
				System.out.print(user + " escolheu tesoura e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Perdeu, tesoura contra trovão.");
				System.out.print(user + " escolheu tesoura e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Perdeu, tesoura contra arma.");
				System.out.print(user + " escolheu tesoura e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 3) { //cobra
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, cobra contra pedra.");
				System.out.print(user + " escolheu pedra e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Perdeu, cobra contra fogo.");
				System.out.print(user + " escolheu cobra e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Perdeu, cobra contra tesoura.");
				System.out.print(user + " escolheu cobra e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Empatou, cobra contra cobra.");
				System.out.print(user + " escolheu cobra e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, cobra contra humano.");
				System.out.print(user + " escolheu cobra e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Ganhou, cobra contra árvore.");
				System.out.print(user + " escolheu cobra e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Ganhou, cobra contra lobo.");
				System.out.print(user + " escolheu cobra e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Ganhou, cobra contra esponja.");
				System.out.print(user + " escolheu cobra e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Ganhou, cobra contra papel.");
				System.out.print(user + " escolheu cobra e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Ganhou, cobra contra ar.");
				System.out.print(user + " escolheu cobra e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Ganhou, cobra contra água.");
				System.out.print(user + " escolheu cobra e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Perdeu, cobra contra dragão.");
				System.out.print(user + " escolheu cobra e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Perdeu, cobra contra demônio.");
				System.out.print(user + " escolheu cobra e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Perdeu, cobra contra trovão.");
				System.out.print(user + " escolheu cobra e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Perdeu, cobra contra arma.");
				System.out.print(user + " escolheu cobra e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 4) { //humano
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, humano contra pedra.");
				System.out.print(user + " escolheu humano e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Perdeu, humano contra fogo.");
				System.out.print(user + " escolheu humano e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Perdeu, humano contra tesoura.");
				System.out.print(user + " escolheu humano e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Perdeu, humano contra cobra.");
				System.out.print(user + " escolheu humano e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Empatou, humano contra humano.");
				System.out.print(user + " escolheu humano e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Ganhou, humano contra árvore.");
				System.out.print(user + " escolheu humano e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Ganhou, humano contra lobo.");
				System.out.print(user + " escolheu humano e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Ganhou, humano contra esponja.");
				System.out.print(user + " escolheu humano e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Ganhou, humano contra papel.");
				System.out.print(user + " escolheu humano e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Ganhou, humano contra ar.");
				System.out.print(user + " escolheu humano e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Ganhou, humano contra água.");
				System.out.print(user + " escolheu humano e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Ganhou, humano contra dragão.");
				System.out.print(user + " escolheu humano e o computador escolheu dragão.");
			}	
			else if (choiceComp == 12) { //demônio
				System.out.println("Perdeu, humano contra demônio.");
				System.out.print(user + " escolheu humano e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Perdeu, humano contra trovão.");
				System.out.print(user + " escolheu humano e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Perdeu, humano contra arma.");
				System.out.print(user + " escolheu humano e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 5) { //Árvore
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, árvore contra pedra.");
				System.out.print(user + " escolheu árvore e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Perdeu, árvore contra fogo.");
				System.out.print(user + " escolheu árvore e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, árvore contra tesoura.");
				System.out.print(user + " escolheu árvore e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, árvore contra cobra.");
				System.out.print(user + " escolheu árvore e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, árvore contra humano.");
				System.out.print(user + " escolheu árvore e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Empatou, árvore contra árvore.");
				System.out.print(user + " escolheu árvore e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Ganhou, árvore contra lobo.");
				System.out.print(user + " escolheu árvore e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Ganhou, árvore contra esponja.");
				System.out.print(user + " escolheu árvore e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, árvore contra papel.");
				System.out.print(user + " escolheu árvore e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, árvore contra ar.");
				System.out.print(user + " escolheu árvore e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Perdeu, árvore contra água.");
				System.out.print(user + " escolheu árvore e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Perdeu, árvore contra dragão.");
				System.out.print(user + " escolheu árvore e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Perdeu, árvore contra demônio.");
				System.out.print(user + " escolheu árvore e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Perdeu, árvore contra trovão.");
				System.out.print(user + " escolheu árvore e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Perdeu, árvore contra arma.");
				System.out.print(user + " escolheu árvore e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 6) { //lobo
			if (choiceComp == 0) { //lobo
				System.out.println("Perdeu, lobo contra pedra.");
				System.out.print(user + " escolheu lobo e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Perdeu, lobo contra fogo.");
				System.out.print(user + " escolheu lobo e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Perdeu, lobo contra tesoura.");
				System.out.print(user + " escolheu lobo e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Perdeu, lobo contra cobra.");
				System.out.print(user + " escolheu lobo e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Perdeu, lobo contra humano.");
				System.out.print(user + " escolheu lobo e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Perdeu, lobo contra árvore.");
				System.out.print(user + " escolheu lobo e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Empatou, lobo contra lobo.");
				System.out.print(user + " escolheu lobo e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Ganhou, lobo contra esponja.");
				System.out.print(user + " escolheu lobo e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Ganhou, lobo contra papel.");
				System.out.print(user + " escolheu lobo e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Ganhou, lobo contra ar.");
				System.out.print(user + " escolheu lobo e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Ganhou, lobo contra água.");
				System.out.print(user + " escolheu lobo e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Ganhou, lobo contra dragão.");
				System.out.print(user + " escolheu lobo e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Ganhou, lobo contra demônio.");
				System.out.print(user + " escolheu lobo e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Ganhou, lobo contra trovão.");
				System.out.print(user + " escolheu lobo e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Perdeu, lobo contra arma.");
				System.out.print(user + " escolheu lobo e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 7) { //esponja
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, esponja contra pedra.");
				System.out.print(user + " escolheu esponja e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Perdeu, esponja contra fogo.");
				System.out.print(user + " escolheu esponja e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Perdeu, esponja contra tesoura.");
				System.out.print(user + " escolheu esponja e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Perdeu, esponja contra cobra.");
				System.out.print(user + " escolheu esponja e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, esponja contra humano.");
				System.out.print(user + " escolheu esponja e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Perdeu, esponja contra árvore.");
				System.out.print(user + " escolheu esponja e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, esponja contra lobo.");
				System.out.print(user + " escolheu esponja e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Empatou, esponja contra esponja.");
				System.out.print(user + " escolheu esponja e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Ganhou, esponja contra papel.");
				System.out.print(user + " escolheu esponja e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Ganhou, esponja contra ar.");
				System.out.print(user + " escolheu esponja e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Ganhou, esponja contra água.");
				System.out.print(user + " escolheu esponja e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Ganhou, esponja contra dragão.");
				System.out.print(user + " escolheu esponja e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Ganhou, esponja contra demônio.");
				System.out.print(user + " escolheu esponja e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Ganhou, esponja contra trovão.");
				System.out.print(user + " escolheu esponja e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Ganhou, esponja contra arma.");
				System.out.print(user + " escolheu pedra e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 8) { //papel
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, papel contra pedra.");
				System.out.print(user + " escolheu papel e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Perdeu, papel contra fogo.");
				System.out.print(user + " escolheu papel e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Perdeu, papel contra tesoura.");
				System.out.print(user + " escolheu papel e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Perdeu, papel contra cobra.");
				System.out.print(user + " escolheu papel e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Perdeu, papel contra humano.");
				System.out.print(user + " escolheu papel e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Perdeu, papel contra árvore.");
				System.out.print(user + " escolheu pedra e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, papel contra lobo.");
				System.out.print(user + " escolheu papel e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, papel contra esponja.");
				System.out.print(user + " escolheu papel e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Empatou, papel contra papel.");
				System.out.print(user + " escolheu papel e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Ganhou, papel contra ar.");
				System.out.print(user + " escolheu papel e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Ganhou, papel contra água.");
				System.out.print(user + " escolheu papel e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Ganhou, papel contra dragão.");
				System.out.print(user + " escolheu papel e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Ganhou, papel contra demônio.");
				System.out.print(user + " escolheu papel e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Ganhou, papel contra trovão.");
				System.out.print(user + " escolheu papel e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Ganhou, papel contra arma.");
				System.out.print(user + " escolheu papel e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 9) { //ar
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, ar contra pedra.");
				System.out.print(user + " escolheu ar e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, ar contra fogo.");
				System.out.print(user + " escolheu ar e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Perdeu, ar contra tesoura.");
				System.out.print(user + " escolheu ar e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Perdeu, ar contra cobra.");
				System.out.print(user + " escolheu ar e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Perdeu, ar contra humano.");
				System.out.print(user + " escolheu ar e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Perdeu, ar contra árvore.");
				System.out.print(user + " escolheu ar e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, ar contra lobo.");
				System.out.print(user + " escolheu ar e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, ar contra esponja.");
				System.out.print(user + " escolheu ar e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, ar contra papel.");
				System.out.print(user + " escolheu ar e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Empatou, ar contra ar.");
				System.out.print(user + " escolheu ar e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Ganhou, ar contra água.");
				System.out.print(user + " escolheu ar e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Ganhou, ar contra dragão.");
				System.out.print(user + " escolheu ar e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Ganhou, ar contra demônio.");
				System.out.print(user + " escolheu ar e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Ganhou, ar contra trovão.");
				System.out.print(user + " escolheu ar e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Ganhou, ar contra arma.");
				System.out.print(user + " escolheu ar e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 10) { //água
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, água contra pedra.");
				System.out.print(user + " escolheu água e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, água contra fogo.");
				System.out.print(user + " escolheu água e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, água contra tesoura.");
				System.out.print(user + " escolheu água e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Perdeu, água contra cobra.");
				System.out.print(user + " escolheu água e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Perdeu, água contra humano.");
				System.out.print(user + " escolheu água e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Perdeu, água contra árvore.");
				System.out.print(user + " escolheu água e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, água contra lobo.");
				System.out.print(user + " escolheu água e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, água contra esponja.");
				System.out.print(user + " escolheu água e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, água contra papel.");
				System.out.print(user + " escolheu água e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, água contra ar.");
				System.out.print(user + " escolheu água e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Empatou, água contra água.");
				System.out.print(user + " escolheu água e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Ganhou, água contra dragão.");
				System.out.print(user + " escolheu água e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Ganhou, água contra demônio.");
				System.out.print(user + " escolheu água e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Ganhou, água contra trovão.");
				System.out.print(user + " escolheu água e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Ganhou, água contra arma.");
				System.out.print(user + " escolheu água e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 11) { //dragão
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, dragão contra pedra.");
				System.out.print(user + " escolheu dragão e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, dragão contra fogo.");
				System.out.print(user + " escolheu dragão e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, dragão contra tesoura.");
				System.out.print(user + " escolheu dragão e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, dragão contra cobra.");
				System.out.print(user + " escolheu dragão e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Perdeu, dragão contra humano.");
				System.out.print(user + " escolheu dragão e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Perdeu, dragão contra árvore.");
				System.out.print(user + " escolheu dragão e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, dragão contra lobo.");
				System.out.print(user + " escolheu dragão e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, dragão contra esponja.");
				System.out.print(user + " escolheu dragão e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, dragão contra papel.");
				System.out.print(user + " escolheu dragão e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, dragão contra ar.");
				System.out.print(user + " escolheu dragão e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Perdeu, dragão contra água.");
				System.out.print(user + " escolheu dragão e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Empatou, dragão contra dragão.");
				System.out.print(user + " escolheu dragão e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Ganhou, dragão contra demônio.");
				System.out.print(user + " escolheu dragão e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Ganhou, dragão contra trovão.");
				System.out.print(user + " escolheu dragão e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Ganhou, dragão contra arma.");
				System.out.print(user + " escolheu dragão e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 12) { //demônio
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, demônio contra pedra.");
				System.out.print(user + " escolheu demônio e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, demônio contra fogo.");
				System.out.print(user + " escolheu demônio e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, demônio contra tesoura.");
				System.out.print(user + " escolheu demônio e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, demônio contra cobra.");
				System.out.print(user + " escolheu demônio e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, demônio contra humano.");
				System.out.print(user + " escolheu demônio e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Perdeu, demônio contra árvore.");
				System.out.print(user + " escolheu demônio e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, demônio contra lobo.");
				System.out.print(user + " escolheu demônio e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, demônio contra esponja.");
				System.out.print(user + " escolheu demônio e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, demônio contra papel.");
				System.out.print(user + " escolheu demônio e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, demônio contra ar.");
				System.out.print(user + " escolheu demônio e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Perdeu, demônio contra água.");
				System.out.print(user + " escolheu demônio e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Perdeu, demônio contra dragão.");
				System.out.print(user + " escolheu demônio e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Empate, demônio contra demônio.");
				System.out.print(user + " escolheu demônio e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Ganhou, demônio contra trovão.");
				System.out.print(user + " escolheu demônio e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Ganhou, demônio contra arma.");
				System.out.print(user + " escolheu demônio e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 13) { //trovão
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, trovão contra pedra.");
				System.out.print(user + " escolheu trovão e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, trovão contra fogo.");
				System.out.print(user + " escolheu trovão e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, trovão contra tesoura.");
				System.out.print(user + " escolheu trovão e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, trovão contra cobra.");
				System.out.print(user + " escolheu trovão e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, trovão contra humano.");
				System.out.print(user + " escolheu trovão e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Ganhou, trovão contra árvore.");
				System.out.print(user + " escolheu trovão e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, trovão contra lobo.");
				System.out.print(user + " escolheu trovão e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, trovão contra esponja.");
				System.out.print(user + " escolheu trovão e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, trovão contra papel.");
				System.out.print(user + " escolheu trovão e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, trovão contra ar.");
				System.out.print(user + " escolheu trovão e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Perdeu, trovão contra água.");
				System.out.print(user + " escolheu trovão e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Perdeu, trovão contra dragão.");
				System.out.print(user + " escolheu trovão e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Perdeu, trovão contra demônio.");
				System.out.print(user + " escolheu trovão e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Empate, trovão contra trovão.");
				System.out.print(user + " escolheu trovão e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Perdeu, trovão contra arma.");
				System.out.print(user + " escolheu trovão e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 14) { //arma
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, arma contra pedra.");
				System.out.print(user + " escolheu arma e o computador também.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, arma contra fogo.");
				System.out.print(user + " escolheu arma e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, arma contra tesoura.");
				System.out.print(user + " escolheu arma e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, arma contra cobra.");
				System.out.print(user + " escolheu arma e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, arma contra humano.");
				System.out.print(user + " escolheu arma e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //árvore
				System.out.println("Ganhou, arma contra árvore.");
				System.out.print(user + " escolheu arma e o computador escolheu árvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Ganhou, arma contra lobo.");
				System.out.print(user + " escolheu arma e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, arma contra esponja.");
				System.out.print(user + " escolheu arma e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, arma contra papel.");
				System.out.print(user + " escolheu arma e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, arma contra ar.");
				System.out.print(user + " escolheu arma e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //água
				System.out.println("Perdeu, arma contra água.");
				System.out.print(user + " escolheu arma e o computador escolheu água.");
			}
			else if (choiceComp == 11) { //dragão
				System.out.println("Perdeu, arma contra dragão.");
				System.out.print(user + " escolheu arma e o computador escolheu dragão.");
			}
			else if (choiceComp == 12) { //demônio
				System.out.println("Perdeu, arma contra demônio.");
				System.out.print(user + " escolheu arma e o computador escolheu demônio.");
			}
			else if (choiceComp == 13) { //trovão
				System.out.println("Perdeu, arma contra trovão.");
				System.out.print(user + " escolheu arma e o computador escolheu trovão.");
			}
			else { //arma
				System.out.println("Empate, arma contra arma.");
				System.out.print(user + " escolheu arma e o computador escolheu arma.");
			}
		}
		
		//System.out.print("------Fim do programa------");
	}

}
