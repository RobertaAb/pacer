package br.gov.fatec.pacer.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

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
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return papel;
	}
	public void setCargo(String papel) {
		this.papel = papel;
	}
	
}
