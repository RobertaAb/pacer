package br.gov.fatec.pacer.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EquipesDto {

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
