package model.personagem;

import model.inter.Arma;
import model.inter.Personagem;

public class Troll implements Arma, Personagem {

	private Arma arma;
	
	public Troll(Arma arma) {
		this.arma = arma;
	}
	
	public void executarAtaque() {
		System.out.println("Troll");
		arma.atacar();
	}

}
