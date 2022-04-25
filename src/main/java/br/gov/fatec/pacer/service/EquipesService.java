package br.gov.fatec.pacer.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.gov.fatec.pacer.dto.EquipesDto;
import br.gov.fatec.pacer.model.EquipesModel;
import br.gov.fatec.pacer.repository.EquipesRepository;

@Service
public class EquipesService {

	final EquipesRepository equipesRepository;
	
	public EquipesService(EquipesRepository equipesRepository) {
		this.equipesRepository = equipesRepository;
	}

	@Transactional
	public EquipesModel save(EquipesDto equipesDto) {
		var equipesModel = new EquipesModel();
		BeanUtils.copyProperties(equipesDto, equipesModel);
		return equipesRepository.save(equipesModel);

	}

	
}