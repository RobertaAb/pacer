package br.gov.fatec.pacer.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.gov.fatec.pacer.model.RespostasModel;
import br.gov.fatec.pacer.repository.RespostasRepository;

@Service
public class RespostaService {
	
	  
	final RespostasRepository	RespostasRepository;
	
	public RespostaService(RespostasRepository respostasRepository) {
		this.RespostasRepository = respostasRepository;
	}

	@Transactional
	public RespostasModel save(RespostasModel respostasModel) {
		return RespostasRepository.save(respostasModel);
}
	
}
