package model;

import java.time.LocalTime;

public class Vaga {

	private String numeroVaga;
	private TipoVeiculo tipoVaga;
	private boolean ocupado;
	private double valorHora;
	private double valorHoraAdicional;
	private LocalTime tempoTolerancia;
	public String getNumeroVaga() {
		return numeroVaga;
	}
	public void setNumeroVaga(String numeroVaga) {
		this.numeroVaga = numeroVaga;
	}
	public TipoVeiculo getTipoVaga() {
		return tipoVaga;
	}
	public void setTipoVaga(TipoVeiculo tipoVaga) {
		this.tipoVaga = tipoVaga;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
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
