package br.gov.fatec.pacer.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.fatec.pacer.model.EquipesModel;

@Repository
public interface EquipesRepository extends JpaRepository<EquipesModel, UUID> {

}
