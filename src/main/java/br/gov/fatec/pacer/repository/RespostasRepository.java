package br.gov.fatec.pacer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import br.gov.fatec.pacer.model.RespostasModel;

@Repository
public interface RespostasRepository extends JpaRepository<RespostasModel, ID>{

}
