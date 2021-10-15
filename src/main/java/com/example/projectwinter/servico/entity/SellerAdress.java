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
@Table(name = "seller_adress")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class SellerAdress implements Serializable {

    private static final long serialVersionUID = -2078701704739397020L;

    @Id
    @GeneratedValue
    private int codigo;

    @JsonProperty("id")
    @Column
    private String id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "city_id")
    @JsonProperty("city")
    private City city;

    @ManyToOne
    @JoinColumn(nullable = false, name = "state_id")
    @JsonProperty("state")
    private State state;

    @ManyToOne
    @JoinColumn(nullable = false, name = "country_id")
    @JsonProperty("country")
    private Country country;

    public SellerAdress() {
    }

    public SellerAdress(String id, City city, State state, Country country) {
        super();
        this.id = id;
        this.city = city;
        this.state = state;
        this.country = country;
    }


}
