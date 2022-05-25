package br.gov.fatec.pacer.repository;

import br.gov.fatec.pacer.model.IntegranteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IntegranteRepository extends JpaRepository<IntegranteModel, UUID> {

}
