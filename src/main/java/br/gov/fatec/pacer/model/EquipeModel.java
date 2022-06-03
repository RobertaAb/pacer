package br.gov.fatec.pacer.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "equipe")
public class EquipeModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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



	

}