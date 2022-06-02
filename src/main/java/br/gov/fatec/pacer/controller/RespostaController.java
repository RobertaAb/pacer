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

	@GetMapping("/listar")
	public List<Resposta> ListarTodos() {
		return respostaService.findAll();
	}

	@PostMapping("/salvarResposta")
	public ResponseEntity<Object> saveResposta(@RequestBody @Valid RespostaDto respostaDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(respostaService.save(respostaDto));
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
			@RequestBody Resposta resposta) {
		return repository.findById(id)
				.map(record -> {
					record.setSprint(equipe.getSprint());
					record.setProatividade(equipe.getProatividade());
					record.setAutonomia(equipe.getAutonomia());
					record.setColaboração(usuario.getColaboração());
					record.setEntregaResultado(usuario.getEntregaResultado());
					Usuario updated = repository.save(record);
					return ResponseEntity.ok().body(updated);
				}).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping
	public List findAll() {
		return repository.findAll();
	}
}
