package com.example.projectwinter.servico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "attributes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Attributes implements Serializable {

    private static final long serialVersionUID = 8900957845874581784L;

    @Id
    @GeneratedValue
    private int codigo;

    @JsonProperty("id")
    @Column
    private String id;

    @Column(nullable = false)
    @JsonProperty("value_name")
    private String name;

    public Attributes() {
    }

    public Attributes(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
