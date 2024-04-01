import java.util.Scanner;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
	
		Random choice = new Random();
		Scanner reader = new Scanner(System.in);
		
		int choiceComp;
		int choicePla;
		String user;
		
		System.out.println("Escolha uma op��o:");
		System.out.println("--------------------");
		System.out.println("    0 --> Pedra");
		System.out.println("    1 --> Fogo");
		System.out.println("    2 --> Tesoura");
		System.out.println("    3 --> Cobra");
		System.out.println("    4 --> Humano");
		System.out.println("    5 --> �rvore");
		System.out.println("    6 --> Lobo");
		System.out.println("    7 --> Esponja");
		System.out.println("    8 --> Papel");
		System.out.println("    9 --> Ar");
		System.out.println("    10 --> �gua");
		System.out.println("    11 --> Drag�o");
		System.out.println("    12 --> Dem�nio");
		System.out.println("    13 --> Trov�o");
		System.out.println("    14 --> Arma");
		System.out.println("--------------------");
		System.out.println("Qual � a tua op��o? ");
		
		choiceComp = choice.nextInt(15);
		choicePla = reader.nextInt();
		
		System.out.println("--------------------");
		
		System.out.println("Seu nome:");
		user = reader.next();
		
		System.out.println("--------------------");
		
		if (choicePla == 0) { //pedra
			if (choiceComp == 0) { //pedra
				System.out.println("Empatou, pedra contra pedra.");
				System.out.print(user + " escolheu pedra e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Ganhou, pedra contra �rvore.");
				System.out.print(user + " escolheu pedra e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Perdeu, pedra contra �gua.");
				System.out.print(user + " escolheu pedra e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Perdeu, pedra contra drag�o.");
				System.out.print(user + " escolheu pedra e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Perdeu, pedra contra dem�nio.");
				System.out.print(user + " escolheu pedra e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Perdeu, pedra contra trov�o.");
				System.out.print(user + " escolheu pedra e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Perdeu, pedra contra arma.");
				System.out.print(user + " escolheu pedra e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 1) { //fogo
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, fogo contra pedra.");
				System.out.print(user + " escolheu fogo e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Ganhou, fogo contra �rvore.");
				System.out.print(user + " escolheu fogo e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Perdeu, fogo contra �gua.");
				System.out.print(user + " escolheu fogo e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Perdeu, fogo contra drag�o.");
				System.out.print(user + " escolheu fogo e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Perdeu, fogo contra dem�nio.");
				System.out.print(user + " escolheu fogo e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Perdeu, fogo contra trov�o.");
				System.out.print(user + " escolheu fogo e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Perdeu, fogo contra arma.");
				System.out.print(user + " escolheu fogo e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 2) { //tesoura
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, tesoura contra pedra.");
				System.out.print(user + " escolheu tesoura e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Ganhou, tesoura contra �rvore.");
				System.out.print(user + " escolheu tesoura e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Perdeu, tesoura contra �gua.");
				System.out.print(user + " escolheu tesoura e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Perdeu, tesoura contra drag�o.");
				System.out.print(user + " escolheu tesoura e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Perdeu, tesoura contra dem�nio.");
				System.out.print(user + " escolheu tesoura e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Perdeu, tesoura contra trov�o.");
				System.out.print(user + " escolheu tesoura e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Perdeu, tesoura contra arma.");
				System.out.print(user + " escolheu tesoura e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 3) { //cobra
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, cobra contra pedra.");
				System.out.print(user + " escolheu pedra e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Ganhou, cobra contra �rvore.");
				System.out.print(user + " escolheu cobra e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Ganhou, cobra contra �gua.");
				System.out.print(user + " escolheu cobra e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Perdeu, cobra contra drag�o.");
				System.out.print(user + " escolheu cobra e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Perdeu, cobra contra dem�nio.");
				System.out.print(user + " escolheu cobra e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Perdeu, cobra contra trov�o.");
				System.out.print(user + " escolheu cobra e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Perdeu, cobra contra arma.");
				System.out.print(user + " escolheu cobra e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 4) { //humano
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, humano contra pedra.");
				System.out.print(user + " escolheu humano e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Ganhou, humano contra �rvore.");
				System.out.print(user + " escolheu humano e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Ganhou, humano contra �gua.");
				System.out.print(user + " escolheu humano e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Ganhou, humano contra drag�o.");
				System.out.print(user + " escolheu humano e o computador escolheu drag�o.");
			}	
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Perdeu, humano contra dem�nio.");
				System.out.print(user + " escolheu humano e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Perdeu, humano contra trov�o.");
				System.out.print(user + " escolheu humano e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Perdeu, humano contra arma.");
				System.out.print(user + " escolheu humano e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 5) { //�rvore
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, �rvore contra pedra.");
				System.out.print(user + " escolheu �rvore e o computador tamb�m.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Perdeu, �rvore contra fogo.");
				System.out.print(user + " escolheu �rvore e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, �rvore contra tesoura.");
				System.out.print(user + " escolheu �rvore e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, �rvore contra cobra.");
				System.out.print(user + " escolheu �rvore e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, �rvore contra humano.");
				System.out.print(user + " escolheu �rvore e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //�rvore
				System.out.println("Empatou, �rvore contra �rvore.");
				System.out.print(user + " escolheu �rvore e o computador escolheu �rvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Ganhou, �rvore contra lobo.");
				System.out.print(user + " escolheu �rvore e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Ganhou, �rvore contra esponja.");
				System.out.print(user + " escolheu �rvore e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, �rvore contra papel.");
				System.out.print(user + " escolheu �rvore e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, �rvore contra ar.");
				System.out.print(user + " escolheu �rvore e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //�gua
				System.out.println("Perdeu, �rvore contra �gua.");
				System.out.print(user + " escolheu �rvore e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Perdeu, �rvore contra drag�o.");
				System.out.print(user + " escolheu �rvore e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Perdeu, �rvore contra dem�nio.");
				System.out.print(user + " escolheu �rvore e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Perdeu, �rvore contra trov�o.");
				System.out.print(user + " escolheu �rvore e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Perdeu, �rvore contra arma.");
				System.out.print(user + " escolheu �rvore e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 6) { //lobo
			if (choiceComp == 0) { //lobo
				System.out.println("Perdeu, lobo contra pedra.");
				System.out.print(user + " escolheu lobo e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Perdeu, lobo contra �rvore.");
				System.out.print(user + " escolheu lobo e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Ganhou, lobo contra �gua.");
				System.out.print(user + " escolheu lobo e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Ganhou, lobo contra drag�o.");
				System.out.print(user + " escolheu lobo e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Ganhou, lobo contra dem�nio.");
				System.out.print(user + " escolheu lobo e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Ganhou, lobo contra trov�o.");
				System.out.print(user + " escolheu lobo e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Perdeu, lobo contra arma.");
				System.out.print(user + " escolheu lobo e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 7) { //esponja
			if (choiceComp == 0) { //pedra
				System.out.println("Perdeu, esponja contra pedra.");
				System.out.print(user + " escolheu esponja e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Perdeu, esponja contra �rvore.");
				System.out.print(user + " escolheu esponja e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Ganhou, esponja contra �gua.");
				System.out.print(user + " escolheu esponja e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Ganhou, esponja contra drag�o.");
				System.out.print(user + " escolheu esponja e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Ganhou, esponja contra dem�nio.");
				System.out.print(user + " escolheu esponja e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Ganhou, esponja contra trov�o.");
				System.out.print(user + " escolheu esponja e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Ganhou, esponja contra arma.");
				System.out.print(user + " escolheu pedra e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 8) { //papel
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, papel contra pedra.");
				System.out.print(user + " escolheu papel e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Perdeu, papel contra �rvore.");
				System.out.print(user + " escolheu pedra e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Ganhou, papel contra �gua.");
				System.out.print(user + " escolheu papel e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Ganhou, papel contra drag�o.");
				System.out.print(user + " escolheu papel e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Ganhou, papel contra dem�nio.");
				System.out.print(user + " escolheu papel e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Ganhou, papel contra trov�o.");
				System.out.print(user + " escolheu papel e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Ganhou, papel contra arma.");
				System.out.print(user + " escolheu papel e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 9) { //ar
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, ar contra pedra.");
				System.out.print(user + " escolheu ar e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Perdeu, ar contra �rvore.");
				System.out.print(user + " escolheu ar e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Ganhou, ar contra �gua.");
				System.out.print(user + " escolheu ar e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Ganhou, ar contra drag�o.");
				System.out.print(user + " escolheu ar e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Ganhou, ar contra dem�nio.");
				System.out.print(user + " escolheu ar e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Ganhou, ar contra trov�o.");
				System.out.print(user + " escolheu ar e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Ganhou, ar contra arma.");
				System.out.print(user + " escolheu ar e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 10) { //�gua
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, �gua contra pedra.");
				System.out.print(user + " escolheu �gua e o computador tamb�m.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, �gua contra fogo.");
				System.out.print(user + " escolheu �gua e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, �gua contra tesoura.");
				System.out.print(user + " escolheu �gua e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Perdeu, �gua contra cobra.");
				System.out.print(user + " escolheu �gua e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Perdeu, �gua contra humano.");
				System.out.print(user + " escolheu �gua e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //�rvore
				System.out.println("Perdeu, �gua contra �rvore.");
				System.out.print(user + " escolheu �gua e o computador escolheu �rvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, �gua contra lobo.");
				System.out.print(user + " escolheu �gua e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, �gua contra esponja.");
				System.out.print(user + " escolheu �gua e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, �gua contra papel.");
				System.out.print(user + " escolheu �gua e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, �gua contra ar.");
				System.out.print(user + " escolheu �gua e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //�gua
				System.out.println("Empatou, �gua contra �gua.");
				System.out.print(user + " escolheu �gua e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Ganhou, �gua contra drag�o.");
				System.out.print(user + " escolheu �gua e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Ganhou, �gua contra dem�nio.");
				System.out.print(user + " escolheu �gua e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Ganhou, �gua contra trov�o.");
				System.out.print(user + " escolheu �gua e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Ganhou, �gua contra arma.");
				System.out.print(user + " escolheu �gua e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 11) { //drag�o
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, drag�o contra pedra.");
				System.out.print(user + " escolheu drag�o e o computador tamb�m.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, drag�o contra fogo.");
				System.out.print(user + " escolheu drag�o e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, drag�o contra tesoura.");
				System.out.print(user + " escolheu drag�o e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, drag�o contra cobra.");
				System.out.print(user + " escolheu drag�o e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Perdeu, drag�o contra humano.");
				System.out.print(user + " escolheu drag�o e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //�rvore
				System.out.println("Perdeu, drag�o contra �rvore.");
				System.out.print(user + " escolheu drag�o e o computador escolheu �rvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, drag�o contra lobo.");
				System.out.print(user + " escolheu drag�o e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, drag�o contra esponja.");
				System.out.print(user + " escolheu drag�o e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, drag�o contra papel.");
				System.out.print(user + " escolheu drag�o e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, drag�o contra ar.");
				System.out.print(user + " escolheu drag�o e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //�gua
				System.out.println("Perdeu, drag�o contra �gua.");
				System.out.print(user + " escolheu drag�o e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Empatou, drag�o contra drag�o.");
				System.out.print(user + " escolheu drag�o e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Ganhou, drag�o contra dem�nio.");
				System.out.print(user + " escolheu drag�o e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Ganhou, drag�o contra trov�o.");
				System.out.print(user + " escolheu drag�o e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Ganhou, drag�o contra arma.");
				System.out.print(user + " escolheu drag�o e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 12) { //dem�nio
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, dem�nio contra pedra.");
				System.out.print(user + " escolheu dem�nio e o computador tamb�m.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, dem�nio contra fogo.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, dem�nio contra tesoura.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, dem�nio contra cobra.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, dem�nio contra humano.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //�rvore
				System.out.println("Perdeu, dem�nio contra �rvore.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu �rvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, dem�nio contra lobo.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, dem�nio contra esponja.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, dem�nio contra papel.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, dem�nio contra ar.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //�gua
				System.out.println("Perdeu, dem�nio contra �gua.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Perdeu, dem�nio contra drag�o.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Empate, dem�nio contra dem�nio.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Ganhou, dem�nio contra trov�o.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Ganhou, dem�nio contra arma.");
				System.out.print(user + " escolheu dem�nio e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 13) { //trov�o
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, trov�o contra pedra.");
				System.out.print(user + " escolheu trov�o e o computador tamb�m.");}
			else if (choiceComp == 1) { //fogo
				System.out.println("Ganhou, trov�o contra fogo.");
				System.out.print(user + " escolheu trov�o e o computador escolheu fogo.");
			}
			else if (choiceComp == 2) { //tesoura
				System.out.println("Ganhou, trov�o contra tesoura.");
				System.out.print(user + " escolheu trov�o e o computador escolheu tesoura.");
			}
			else if (choiceComp == 3) { //cobra
				System.out.println("Ganhou, trov�o contra cobra.");
				System.out.print(user + " escolheu trov�o e o computador escolheu cobra.");
			}
			else if (choiceComp == 4) { //humano
				System.out.println("Ganhou, trov�o contra humano.");
				System.out.print(user + " escolheu trov�o e o computador escolheu humano.");
			}
			else if (choiceComp == 5) { //�rvore
				System.out.println("Ganhou, trov�o contra �rvore.");
				System.out.print(user + " escolheu trov�o e o computador escolheu �rvore.");
			}
			else if (choiceComp == 6) { //lobo
				System.out.println("Perdeu, trov�o contra lobo.");
				System.out.print(user + " escolheu trov�o e o computador escolheu lobo.");
			}
			else if (choiceComp == 7) { //esponja
				System.out.println("Perdeu, trov�o contra esponja.");
				System.out.print(user + " escolheu trov�o e o computador escolheu esponja.");
			}
			else if (choiceComp == 8) { //papel
				System.out.println("Perdeu, trov�o contra papel.");
				System.out.print(user + " escolheu trov�o e o computador escolheu papel.");
			}
			else if (choiceComp == 9) { //ar
				System.out.println("Perdeu, trov�o contra ar.");
				System.out.print(user + " escolheu trov�o e o computador escolheu ar.");
			}
			else if (choiceComp == 10) { //�gua
				System.out.println("Perdeu, trov�o contra �gua.");
				System.out.print(user + " escolheu trov�o e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Perdeu, trov�o contra drag�o.");
				System.out.print(user + " escolheu trov�o e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Perdeu, trov�o contra dem�nio.");
				System.out.print(user + " escolheu trov�o e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Empate, trov�o contra trov�o.");
				System.out.print(user + " escolheu trov�o e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Perdeu, trov�o contra arma.");
				System.out.print(user + " escolheu trov�o e o computador escolheu arma.");
			}
		}
		
		if (choicePla == 14) { //arma
			if (choiceComp == 0) { //pedra
				System.out.println("Ganhou, arma contra pedra.");
				System.out.print(user + " escolheu arma e o computador tamb�m.");}
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
			else if (choiceComp == 5) { //�rvore
				System.out.println("Ganhou, arma contra �rvore.");
				System.out.print(user + " escolheu arma e o computador escolheu �rvore.");
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
			else if (choiceComp == 10) { //�gua
				System.out.println("Perdeu, arma contra �gua.");
				System.out.print(user + " escolheu arma e o computador escolheu �gua.");
			}
			else if (choiceComp == 11) { //drag�o
				System.out.println("Perdeu, arma contra drag�o.");
				System.out.print(user + " escolheu arma e o computador escolheu drag�o.");
			}
			else if (choiceComp == 12) { //dem�nio
				System.out.println("Perdeu, arma contra dem�nio.");
				System.out.print(user + " escolheu arma e o computador escolheu dem�nio.");
			}
			else if (choiceComp == 13) { //trov�o
				System.out.println("Perdeu, arma contra trov�o.");
				System.out.print(user + " escolheu arma e o computador escolheu trov�o.");
			}
			else { //arma
				System.out.println("Empate, arma contra arma.");
				System.out.print(user + " escolheu arma e o computador escolheu arma.");
			}
		}
		
		//System.out.print("------Fim do programa------");
	}

}
