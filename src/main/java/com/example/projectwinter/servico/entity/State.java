package com.example.projectwinter.servico.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
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


}
