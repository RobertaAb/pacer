package br.gov.fatec.pacer.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fatec.pacer.dto.EquipeDto;
import br.gov.fatec.pacer.service.EquipeService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/equipe")
public class EquipeController {

	@Autowired
	EquipeService equipeService;

	@PostMapping
	public ResponseEntity<Object> saveEquipes(@RequestBody @Valid EquipeDto equipeDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(equipeService.save(equipeDto));

	}
	@GetMapping
	public ResponseEntity<Object>getAllEquipes(){
		return ResponseEntity.ok(equipeService.getAll());
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Object>getbyId(@PathVariable(value="id") UUID id){
		return ResponseEntity.ok(equipeService.getById(id));
		
}
}
