package br.gov.fatec.pacer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fatec.pacer.model.EquipeModel;
import br.gov.fatec.pacer.repository.EquipeRepository;

@Service
public class EquipeService {
	@Autowired
	EquipeRepository equipeRepository;


	@Transactional
	public EquipeModel save(EquipeModel equipeDto) {
		return equipeRepository.save(equipeDto);

	}

	public List<EquipeModel> findAll() {
		return EquipeRepository.findAll();
	}
    public void delete(Long id) {

		equipeRepository.deleteById(id);
    }
}