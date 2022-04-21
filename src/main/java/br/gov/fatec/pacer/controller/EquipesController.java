package br.gov.fatec.pacer.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fatec.pacer.dto.EquipesDto;
import br.gov.fatec.pacer.model.EquipesModel;
import br.gov.fatec.pacer.service.EquipesService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/equipes")
public class EquipesController {

	final EquipesService equipesService;

	public EquipesController(EquipesService equipesService) {
		this.equipesService = equipesService;
	}

	@PostMapping
	public ResponseEntity<Object> saveEquipes(@RequestBody @Valid EquipesDto equipesDto) {
		var equipesModel = new EquipesModel();
		BeanUtils.copyProperties(equipesDto, equipesModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(equipesService.save(equipesModel));

	}

}
