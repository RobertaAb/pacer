package br.gov.fatec.pacer.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fatec.pacer.dto.EquipeDto;
import br.gov.fatec.pacer.model.EquipeModel;
import br.gov.fatec.pacer.repository.EquipeRepository;

@Service
public class EquipeService {
	@Autowired
	EquipeRepository equipeRepository;
	
	

	@Transactional
	public EquipeModel save(EquipeDto equipeDto) {
		var equipeModel = new EquipeModel();
		BeanUtils.copyProperties(equipeDto, equipeModel);
		return equipeRepository.save(equipeModel);

	}

	public List<EquipeModel> getAll(){
		return equipeRepository.findAll();
	}

	public EquipeModel getById(UUID id){
		return equipeRepository.findById(id).get();
}
}