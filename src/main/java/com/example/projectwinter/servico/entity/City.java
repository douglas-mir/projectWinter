package com.example.projectwinter.servico.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Table(name = "city")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class City implements Serializable {

    private static final long serialVersionUID = 5596310456004056127L;

    @Id
    @GeneratedValue
    private int codigo;

    @JsonProperty("id")
    @Column
    private String id;

    @JsonProperty("name")
    @Column(nullable = false)
    private String name;

    public City() {
    }

    public City(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

}
