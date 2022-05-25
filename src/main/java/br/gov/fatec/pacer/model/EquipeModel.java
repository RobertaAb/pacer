package br.gov.fatec.pacer.model;

import java.util.UUID;

import javax.persistence.*; 

@Entity
@Table(name = "equipe")
public class EquipeModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "ano", nullable = false)
	private String ano;

	@Column(name = "semestre", nullable = false)
	private String semestre;


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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


