package br.gov.fatec.pacer.model;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "integrante")
public class IntegranteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name", unique = true,nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "papel", nullable = false)
    private String papel;

    @OneToOne(cascade = CascadeType.PERSIST)
    private EquipeModel equipeModel;

    public EquipeModel getEquipeModel() {
        return equipeModel;
    }

    public void setEquipeModel(EquipeModel equipeModel) {
        this.equipeModel = equipeModel;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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