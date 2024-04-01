package model.personagem;

import model.inter.Arma;
import model.inter.Personagem;

public class Rainha implements Arma, Personagem {

	private Arma arma;
	
	public Rainha(Arma arma) {
		this.arma = arma;
	}
	
	public void executarAtaque() {
		System.out.println("Rainha");
		arma.atacar();
	}

}
