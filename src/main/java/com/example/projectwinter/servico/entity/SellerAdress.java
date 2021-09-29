package com.example.projectwinter.servico.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "seller_adress")
@JsonIgnoreProperties({"hibernateLazyInitializer"})

public class SellerAdress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(nullable = false, name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(nullable = false, name = "state_id")
    private State state;

    @ManyToOne
    @JoinColumn(nullable = false, name = "country_id")
    private Country country;

    public SellerAdress() {
    }

    public SellerAdress(long id, Produto produto, City city, State state, Country country) {
        this.id = id;
        this.produto = produto;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
