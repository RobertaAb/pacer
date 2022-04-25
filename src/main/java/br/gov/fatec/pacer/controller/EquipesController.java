package br.gov.fatec.pacer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fatec.pacer.dto.EquipesDto;
import br.gov.fatec.pacer.service.EquipesService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class EquipesController {

	@Autowired
	EquipesService equipesService;

	@PostMapping("/equipe")
	public ResponseEntity<Object> saveEquipes(@RequestBody @Valid EquipesDto equipesDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(equipesService.save(equipesDto));

	}
	@GetMapping("/contact")
    public ResponseEntity<?> getContact(){
        return ResponseEntity.ok("Teste Realizado com sucesso!");
    }
}
