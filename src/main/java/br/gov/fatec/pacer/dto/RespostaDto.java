package br.gov.fatec.pacer.dto;

import javax.validation.constraints.NotBlank;
import lombok.Data;
@Data
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
}
