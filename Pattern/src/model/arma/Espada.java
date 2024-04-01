package model.arma;

import model.inter.Arma;

/**
 * As implementações concretas implementar dife-
 * rentes armas seguindo a interface base.
 * A interface possibilita serem interco-
 * municáveis no contexto.
 *
 * @since 1.0
 * @see java.awt
 */

public class Espada implements Arma {

	public void atacar() {
		System.out.println("Ataque feito com espada!");
	}

}
