package br.gov.fatec.pacer.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fatec.pacer.dto.EquipeDto;
import br.gov.fatec.pacer.model.EquipeModel;
import br.gov.fatec.pacer.repository.EquipeRepository;
import br.gov.fatec.pacer.service.EquipeService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/equipe")
public class EquipeController {

	@Autowired
	EquipeService equipeService;

	@PostMapping
	public ResponseEntity<Object> saveEquipes(@RequestBody @Valid EquipeDto equipesDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(equipeService.save(equipesDto));

	}

	@GetMapping
	public ResponseEntity<Object> getAllEquipes() {
		return ResponseEntity.ok(equipeService.getAll());

	}

	@GetMapping("/teste/{id}")
	public ResponseEntity<Object>getbyId(@PathVariable(value="id") UUID id){
		return ResponseEntity.ok(equipeService.getById(id));
	
		EquipeRepository repository;

		@GetMapping("/lista")
		public List<EquipeModel> getAllEquipesModels(){
			return repository.findAll();
		}

		@GetMapping("/nome/{id}")
		public nome getAllNomeById(@PathVariable String nome){
			return repository.getOne(id);
		}

		@PostMApping("/nome")
		public nome saveNome(@RequestBody nome nomeAluno){
			return repository.save(nomeAluno);
		}

		@DeleteMapping("/nome/{id}")
		public void deteleNome(@PathVariable UUID id){
			repository.deteleById(id);
		}


		@DeleteMapping("/equipe/{id}")
		public void deteleEquipe(@PathVariable UUID id){
			repository.deteleById(id);
		}
}
}
