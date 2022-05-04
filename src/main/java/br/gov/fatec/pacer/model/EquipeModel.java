package br.gov.fatec.pacer.model;

import java.util.UUID;

import javax.persistence.*; 

@Entity
@Table(name = "equipe")
public class EquipeModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "ano", nullable = false)
	private String ano;
	
	@Column(name = "semestre", nullable = false)
	private String semestre;
	
	@Column(name = "equipe", nullable = false)
	private String name;
	
	@Column(name = "integrante_name", unique = true,nullable = false)
	private String integrante;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "cargo", nullable = false)
	private String papel;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntegrante() {
		return integrante;
	}

	public void setIntegrante(String integrante) {
		this.integrante = integrante;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}
}