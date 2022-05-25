package br.gov.fatec.pacer.dto;

import br.gov.fatec.pacer.model.EquipeModel;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class IntegranteDto {

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String papel;

    private UUID equipe_id;

    public UUID getEquipe_id() {
        return equipe_id;
    }

    public void setEquipe_id(UUID equipe_id) {
        this.equipe_id = equipe_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
}
