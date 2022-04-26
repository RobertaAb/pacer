package br.gov.fatec.pacer.service;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fatec.pacer.dto.RespostaDto;
import br.gov.fatec.pacer.model.RespostaModel;
import br.gov.fatec.pacer.repository.RespostaRepository;

@Service
public class RespostaService {
	
	@Autowired  
	RespostaRepository respostasRepository;
	
	@Transactional
	public RespostaModel save(RespostaDto respostasDto) {
		var respostasModel = new RespostaModel();
		BeanUtils.copyProperties(respostasDto, respostasModel);
		respostasModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		return respostasRepository.save(respostasModel);
}
	
}
