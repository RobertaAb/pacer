package br.gov.fatec.pacer.model;


import java.time.LocalDateTime;

import javax.persistence.*;


@Entity
@Table(name = "resposta")
public class RespostasModel {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "sprint",unique = true, nullable = false)
	private String sprint;
	
	@Column(name = "proatividade", nullable = false)
	private Integer proatividade;
	
	@Column(name = "autonomia", nullable = false)
	private Integer autonomia;	
	
	@Column(name = "colaboracao", nullable = false)
	private Integer colaboracao;	
	
	@Column(name = "entregaResultado", nullable = false)
	private Integer entregaResultado;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public void setRegistrationDate(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
	
}
