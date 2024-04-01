package model;

import java.time.LocalTime;

public class Pessoa {

	private String numeroVaga;
	private String tipoVaga; // Moto | Passeio | Utilitário
	private boolean ocupado;
	private double valorHora;
	private double valorHoraAdicional;
	private LocalTime tempoTolerancia;
	
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	public boolean isOcupado() {
		return this.ocupado;
	}

	public String getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(String numeroVaga) {
		this.numeroVaga = numeroVaga;
	}

	public String getTipoVaga() {
		return tipoVaga;
	}

	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getValorHoraAdicional() {
		return valorHoraAdicional;
	}

	public void setValorHoraAdicional(double valorHoraAdicional) {
		this.valorHoraAdicional = valorHoraAdicional;
	}

	public LocalTime getTempoTolerancia() {
		return tempoTolerancia;
	}

	public void setTempoTolerancia(LocalTime tempoTolerancia) {
		this.tempoTolerancia = tempoTolerancia;
	}
	
}
