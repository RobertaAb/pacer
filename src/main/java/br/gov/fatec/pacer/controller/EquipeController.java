package br.gov.fatec.pacer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fatec.pacer.dto.EquipeDto;
import br.gov.fatec.pacer.service.EquipeService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/equipe")
public class EquipeController {

	@Autowired
	EquipeService equipeService;

	@GetMapping("/listar")
	public List<Equipe> ListarTodos() {
		return equipeService.findAll();
	}

	@PostMapping("/salvarEquipe")
	public ResponseEntity<Object> saveUsuario(@RequestBody @Valid EquipeDto equipeDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(equipeService.save(equipeDto));
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable long id) {
		return repository.findById(id)
				.map(record -> {
					repository.deleteById(id);
					return ResponseEntity.ok().build();
				}).orElse(ResponseEntity.notFound().build());
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity update(@PathVariable("id") long id,
			@RequestBody Equipe equipe) {
		return repository.findById(id)
				.map(record -> {
					record.setAno(equipe.getAno());
					record.setSemestre(equipe.getSemestre());
					record.setEquipe(equipe.getEquipe());
					record.setNome(usuario.getNome());
					record.setEmail(usuario.getEmail());
					record.setPapel(usuario.getPapel());
					Usuario updated = repository.save(record);
					return ResponseEntity.ok().body(updated);
				}).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping
	public List findAll() {
		return repository.findAll();
	}
}
