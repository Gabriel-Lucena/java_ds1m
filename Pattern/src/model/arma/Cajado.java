package model.arma;

import model.inter.Arma;

/**
 * As implementa��es concretas implementar dife-
 * rentes armas seguindo a interface base.
 * A interface possibilita serem interco-
 * munic�veis no contexto.
 *
 * @since 1.0
 * @see java.awt
 */

public class Cajado implements Arma {
	
	public void atacar() {
		System.out.println("Ataque feito com cajado!");
	}
}
