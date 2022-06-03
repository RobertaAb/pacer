package br.gov.fatec.pacer.model;

import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name = "resposta")
public class RespostaModel {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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
	


}
