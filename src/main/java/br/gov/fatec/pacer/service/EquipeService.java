package br.gov.fatec.pacer.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.gov.fatec.pacer.dto.EquipeDto;
import br.gov.fatec.pacer.model.EquipeModel;
import br.gov.fatec.pacer.repository.EquipeRepository;

@Service
public class EquipeService {

	final EquipeRepository equipesRepository;
	
	public EquipeService(EquipeRepository equipesRepository) {
		this.equipesRepository = equipesRepository;
	}

	@Transactional
	public EquipeModel save(EquipeDto equipesDto) {
		var equipesModel = new EquipeModel();
		BeanUtils.copyProperties(equipesDto, equipesModel);
		return equipesRepository.save(equipesModel);

	}

	
}