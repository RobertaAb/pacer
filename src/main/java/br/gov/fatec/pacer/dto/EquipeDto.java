package br.gov.fatec.pacer.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
@Data
public class EquipeDto {
	
	@NotBlank
	private String semestre;
	@NotBlank
	private String ano;
	@NotBlank
	private String equipe;
	@NotBlank
	private String nome;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String cargo;

}
