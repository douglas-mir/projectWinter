package com.example.projectwinter.servico.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
