package br.gov.fatec.pacer.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.fatec.pacer.model.RespostaModel;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaModel, UUID>{

}
