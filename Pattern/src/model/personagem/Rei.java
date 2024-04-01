package model.personagem;

import model.inter.Arma;
import model.inter.Personagem;

public class Rei implements Arma, Personagem {

	private Arma arma;
	
	public Rei(Arma arma) {
		this.arma = arma;
	}
	
	public void executarAtaque() {
		System.out.println("Rei");
		arma.atacar();
	}

}
