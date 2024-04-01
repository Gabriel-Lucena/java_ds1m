package br.sena.sp.jandira.model;

import java.time.LocalDate;

public class Conta {

	private String numeroConta;
	private String agencia;
	private Cliente cliente;
	private double saldo;
	private String banco;
	private LocalDate dataAbertura;

	// Método construtor. Será chamado quando criarmos um novo objeto utilizando a
	// instrução new

	public Conta(Cliente cliente, double valor) {
		System.out.println("Conta criada com sucesso!");
		System.out.println("-------------------------");
		this.cliente = cliente;
		saldo = valor;
	}

	public Conta(Cliente string) {
		System.out.println("Conta criada com sucesso!");
		System.out.println("-------------------------");
		this.cliente = string;
	}

	public Conta() {
		System.out.println("Conta vazia criada.");
		System.out.println("-------------------------");
	}
	// Métodos de acesso

	public void setNumeroConta(String conta) {
		if (conta.length() > 5) {
			numeroConta = conta;
		} else {
			System.out.printf("Digite um n�mero de conta v�lido!");
			System.out.printf("------------------------- \n");
		}
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(double valor) {

		if (valor > 0) {
			saldo = valor + saldo;
		} else {
			System.out.printf("Engraçadinho \n");
			System.out.printf("------------------------- \n");
		}
	}

	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo = -valor + saldo;
			return true;
		} else {
			System.out.printf("Tu n�o podes sacar aquilo que n�o tens \n");
			System.out.printf("------------------------- \n");
			return false;
		}
	}

	public void transferir(Conta contaDestino, double quantia) {
			if (this.sacar(quantia)) {
				contaDestino.depositar(quantia);
			}
			else {
				System.out.printf("Tu n�o podes transferir aquilo que n�o tens \n");
				System.out.printf("------------------------- \n");
			}
		
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getBanco() {
		return banco;
	}

	public String getNumeroConta() {
		return numeroConta;
	}
}
