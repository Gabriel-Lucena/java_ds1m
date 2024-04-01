package model.personagem;

import model.inter.Arma;
import model.inter.Personagem;

public class BoboCorte implements Personagem, Arma {

	private Arma arma;
	
	public BoboCorte(Arma arma) {
		this.arma = arma;
	}
	
	public void executarAtaque() {
		System.out.println("Bobo da corte");
		arma.atacar();
	}

}
