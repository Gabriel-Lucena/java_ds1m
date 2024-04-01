package model;

import java.time.LocalDate;

import model.Cliente;

public class Veiculo {

	private String placa;
	private String modelo;
	private String tipoDoVeiculo;
	private LocalDate horarioDeEntrada;
	private LocalDate horarioDeSaida;
	private int numeroDaVagaOcupada;

	//M�todo de constru��o
	
	public Veiculo() {
		System.out.println("--------------------------------------------------");
		System.out.println("Ve�culo (vazio) cadastrado com sucesso!");
		System.out.println("--------------------------------------------------");
	}
	
	
	public Veiculo(	Cliente cliente,
					String placa, 
					String modelo, 
					String tipoDoVeiculo, 
					LocalDate horarioDeEntrada,
					int numeroDaVagaOcupada)
	{
		System.out.println("--------------------------------------------------");
		System.out.println("Ve�culo cadastrado com sucesso!");
		System.out.println("--------------------------------------------------");
	}
	
	
}
