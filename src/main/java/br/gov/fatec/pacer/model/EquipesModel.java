package br.gov.fatec.pacer.model;

import java.util.UUID;

import javax.persistence.*; 

@Entity
@Table(name = "equipes")
public class EquipesModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "ano", nullable = false)
	private String ano;
	
	@Column(name = "semestre", nullable = false)
	private String semestre;
	
	@Column(name = "equipe", unique = true, nullable = false)
	private String equipe;
	
	
	@Column(name = "nome", unique = true,nullable = false)
	private String nome;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "cargo", nullable = false)
	private String cargo;
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	

}