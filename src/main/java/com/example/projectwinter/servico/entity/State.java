package com.example.projectwinter.servico.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "state")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class State implements Serializable {

    private static final long serialVersionUID = -1963866738140779824L;

    @Id
    @GeneratedValue
    private int codigo;

    @JsonProperty("id")
    @Column
    private String id;

    @JsonProperty("name")
    @Column(nullable = false)
    private String name;

    public State() {
    }

    public State(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
