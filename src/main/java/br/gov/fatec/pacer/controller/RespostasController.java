package br.gov.fatec.pacer.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fatec.pacer.dto.RespostasDto;
import br.gov.fatec.pacer.model.RespostasModel;
import br.gov.fatec.pacer.service.RespostaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/respostas")
public class RespostasController {

	final RespostaService respostasService;

	public RespostasController(RespostaService respostaService) {
		this.respostasService = respostaService;
	}

	@PostMapping
	public ResponseEntity<Object> saveRespostas(@RequestBody @Valid RespostasDto respostasDto){
		var respostasModel = new RespostasModel();
		BeanUtils.copyProperties(respostasDto, respostasModel);
		respostasModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(respostasService.save(respostasModel));
	}

}
