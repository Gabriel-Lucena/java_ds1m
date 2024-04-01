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

	//Método de construção
	
	public Veiculo() {
		System.out.println("--------------------------------------------------");
		System.out.println("Veículo (vazio) cadastrado com sucesso!");
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
		System.out.println("Veículo cadastrado com sucesso!");
		System.out.println("--------------------------------------------------");
	}
	
	
}
