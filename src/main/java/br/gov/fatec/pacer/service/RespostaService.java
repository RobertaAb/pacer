package br.gov.fatec.pacer.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fatec.pacer.dto.RespostaDto;
import br.gov.fatec.pacer.model.RespostaModel;
import br.gov.fatec.pacer.repository.RespostaRepository;

import java.util.List;

@Service
public class RespostaService {
	
	@Autowired  
	RespostaRepository respostaRepository;

	public static List<RespostaModel> findAll() {
		return respostaRepository.findAll();
	}

	@Transactional
	public RespostaModel save(RespostaDto respostaDto) {
		var respostaModel = new RespostaModel();
		return respostaRepository.save(respostaModel);
}

	public void delete(Long id) {
		respostaRepository.deleteById(id);
	}
}
