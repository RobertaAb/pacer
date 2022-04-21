package br.gov.fatec.pacer.dto;

import javax.validation.constraints.NotBlank;


public class RespostasDto {

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
}
