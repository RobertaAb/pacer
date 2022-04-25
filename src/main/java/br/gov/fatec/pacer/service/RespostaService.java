package br.gov.fatec.pacer.service;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fatec.pacer.dto.RespostasDto;
import br.gov.fatec.pacer.model.RespostasModel;
import br.gov.fatec.pacer.repository.RespostasRepository;

@Service
public class RespostaService {
	
	@Autowired  
	RespostasRepository respostasRepository;
	
	@Transactional
	public RespostasModel save(RespostasDto respostasDto) {
		var respostasModel = new RespostasModel();
		BeanUtils.copyProperties(respostasDto, respostasModel);
		respostasModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		return respostasRepository.save(respostasModel);
}
	
}
