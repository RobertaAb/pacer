package br.gov.fatec.pacer.controller;

import javax.validation.Valid;

import br.gov.fatec.pacer.model.EquipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.gov.fatec.pacer.dto.EquipeDto;
import br.gov.fatec.pacer.service.EquipeService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/equipe")
public class EquipeController {

	@Autowired
	EquipeService equipeService;

	@PostMapping
	public ResponseEntity<Object> saveEquipe(@RequestBody @Valid EquipeDto equipeDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(equipeService.save(equipeDto));

	}
	@GetMapping
	public ResponseEntity<Object> getAllEquipe(){
		return ResponseEntity.ok(equipeService.getAll());
		
	}
	@GetMapping("/teste/{id}")
	public ResponseEntity<Object>getbyId(@PathVariable(value="id") Long id){
		return ResponseEntity.ok(equipeService.getById(id));
		
}
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestParam Long id) {
		equipeService.delete(id);
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody EquipeModel equipe) {
		return ResponseEntity.status(HttpStatus.CREATED).body(equipeService.save(equipe));
	}
}
