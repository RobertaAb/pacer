package br.gov.fatec.pacer.service;

import br.gov.fatec.pacer.dto.EquipeDto;
import br.gov.fatec.pacer.dto.IntegranteDto;
import br.gov.fatec.pacer.model.EquipeModel;
import br.gov.fatec.pacer.model.IntegranteModel;
import br.gov.fatec.pacer.repository.EquipeRepository;
import br.gov.fatec.pacer.repository.IntegranteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
@Service
public class IntegranteService {
    @Autowired
    IntegranteRepository integranteRepository;

    @Autowired
   EquipeService equipeService;
   /* @Transactional*/
    public IntegranteModel save(IntegranteDto integranteDto) {
        var integranteModel = new IntegranteModel();
        BeanUtils.copyProperties(integranteDto, integranteModel);
        var equipeModel = equipeService.getById(integranteDto.getEquipe_id());
        integranteModel.setEquipeModel(equipeModel);
        return integranteRepository.save(integranteModel);

    }

    public List<IntegranteModel> getAll(){
        return integranteRepository.findAll();
    }

    public IntegranteModel getById(UUID id){
        return integranteRepository.findById(id).get();
    }
}