package br.gov.fatec.pacer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fatec.pacer.dto.RespostaDto;
import br.gov.fatec.pacer.service.RespostaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/resposta")
public class RespostaController {

	@Autowired
	RespostaService respostasService;

	@PostMapping
	public ResponseEntity<Object> saveRespostas(@RequestBody @Valid RespostaDto respostasDto){	
		return ResponseEntity.status(HttpStatus.CREATED).body(respostasService.save(respostasDto));
	}

}
