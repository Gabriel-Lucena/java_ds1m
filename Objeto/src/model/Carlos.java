package model;

public class Carlos implements Humano{
	
	private String nome;
	
	public Carlos(String nome) {
		this.nome = nome;
	}

	public static void comida() {
		
		System.out.println("A comida est� pronta ! ! !");
	}
	
	public static void dalva(String adjetivo, String substantivo) {
		System.out.println("A Dalva � a maior " + adjetivo + " de " + substantivo + "!!!");
	}

	public void apresentar(String nome) {
		System.out.println("Meu nome � " + nome + ".");
	}
	
}
