package br.gov.fatec.pacer.controller;

import java.util.UUID;

import javax.validation.Valid;

import br.gov.fatec.pacer.dto.IntegranteDto;
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

import br.gov.fatec.pacer.service.IntegranteService;

    @RestController
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping("/integrante")
    public class IntegranteController {
        @Autowired
        IntegranteService integranteService;

        @PostMapping
        public ResponseEntity<Object> saveIntegrante(@RequestBody @Valid IntegranteDto integranteDto) {
            return ResponseEntity.status(HttpStatus.CREATED).body(integranteService.save(integranteDto));

        }

        @GetMapping
        public ResponseEntity<Object> getAllIntegrante() {
            return ResponseEntity.ok(integranteService.getAll());

        }

        @GetMapping("/{id}")
        public ResponseEntity<Object> getbyId(@PathVariable(value = "id") UUID id) {
            return ResponseEntity.ok(integranteService.getById(id));

        }
    }

