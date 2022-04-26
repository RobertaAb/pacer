package br.gov.fatec.pacer.dto;

import javax.validation.constraints.NotBlank;


public class RespostaDto {

	@NotBlank
	private String sprint;
	@NotBlank
	private Integer proatividade;
	@NotBlank
	private Integer autonomia;	
	@NotBlank
	private Integer colaboracao;	
	@NotBlank
	private Integer entregaResultado;
	public String getSprint() {
		return sprint;
	}
	public void setSprint(String sprint) {
		this.sprint = sprint;
	}
	public Integer getProatividade() {
		return proatividade;
	}
	public void setProatividade(Integer proatividade) {
		this.proatividade = proatividade;
	}
	public Integer getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}
	public Integer getColaboracao() {
		return colaboracao;
	}
	public void setColaboracao(Integer colaboracao) {
		this.colaboracao = colaboracao;
	}
	public Integer getEntregaResultado() {
		return entregaResultado;
	}
	public void setEntregaResultado(Integer entregaResultado) {
		this.entregaResultado = entregaResultado;
	}
	
}
