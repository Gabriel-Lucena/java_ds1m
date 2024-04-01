package br.sena.sp.jandira.model;

import java.time.LocalDate;

public class Cliente {

	private int codigo;
	private String nome;
	private String email;
	private String telefone;
	private double salario;
	private LocalDate dataNascimento;
	private Empresa empresa;

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// Começo dos get's

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public double getSalario() {
		return salario;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

}
