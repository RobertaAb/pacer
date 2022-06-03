package br.gov.fatec.pacer.controller;

import javax.validation.Valid;

import br.gov.fatec.pacer.model.RespostaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.gov.fatec.pacer.service.RespostaService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/resposta")
public class RespostaController {

	@Autowired
	RespostaService respostaService;

	@PostMapping
	public ResponseEntity<Object> saveResposta(@RequestBody @Valid RespostaModel resposta){
		return ResponseEntity.status(HttpStatus.CREATED).body(respostaService.save(resposta));
	}

	@GetMapping
	public List<RespostaModel> ListarTodos() {
		return RespostaService.findAll();
	}

	@DeleteMapping
	public ResponseEntity<?> delete(@RequestParam Long id) {
		respostaService.delete(id);
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

	}
	@PutMapping
	public ResponseEntity<?> update(@RequestBody RespostaModel resposta) {
		return ResponseEntity.status(HttpStatus.CREATED).body(respostaService.save(resposta));
	}
}

