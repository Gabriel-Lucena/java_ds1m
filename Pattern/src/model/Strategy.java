package model;

import model.inter.Arma;

public class Strategy {

	  /**
	   * O contexto mantém referência os objetos
	   * da Arma (Estratégia). Ele deve trabalhar
	   * com todas as estratégias através da inter-
	   * face estratégia por não saber qual Arma
	   * será selecionada pelo cliente.
	   *
	   * @since 1.0
	   * @see java.awt
	   */
	
	private Arma arma;
	
	public Strategy() {};
	
	  /**
	   * O contexto aceita fornece um setter para que a
	   * estratégia (Arma) possa ser trocado durante o
	   * tempo de execução.
	   *
	   * @since 1.0
	   * @see java.awt
	   */
	
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	  /**
	   * O contexto delega algum trabalho para o objeto estratégia
	   * (Arma) ao invés de implementar as múltiplas versões do al-
	   * goritmo.
	   *
	   * @since 1.0
	   * @see java.awt
	   */

	public void executeArma() {
		arma.atacar();
	}
}
