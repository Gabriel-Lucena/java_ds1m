package model;

import model.inter.Arma;

public class Strategy {

	  /**
	   * O contexto mant�m refer�ncia os objetos
	   * da Arma (Estrat�gia). Ele deve trabalhar
	   * com todas as estrat�gias atrav�s da inter-
	   * face estrat�gia por n�o saber qual Arma
	   * ser� selecionada pelo cliente.
	   *
	   * @since 1.0
	   * @see java.awt
	   */
	
	private Arma arma;
	
	public Strategy() {};
	
	  /**
	   * O contexto aceita fornece um setter para que a
	   * estrat�gia (Arma) possa ser trocado durante o
	   * tempo de execu��o.
	   *
	   * @since 1.0
	   * @see java.awt
	   */
	
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	  /**
	   * O contexto delega algum trabalho para o objeto estrat�gia
	   * (Arma) ao inv�s de implementar as m�ltiplas vers�es do al-
	   * goritmo.
	   *
	   * @since 1.0
	   * @see java.awt
	   */

	public void executeArma() {
		arma.atacar();
	}
}
