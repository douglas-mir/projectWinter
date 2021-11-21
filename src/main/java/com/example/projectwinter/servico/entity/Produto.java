package com.example.projectwinter.servico.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "produto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Produto implements Serializable {

    private static final long serialVersionUID = 2300002659879001344L;

    @Id
    @GeneratedValue
    private int codigo;

    @JsonProperty("id")
    @Column
    private String id;

    @JsonProperty("site_id")
    @Column(name = "site_id", nullable = false)
    private String siteId;

    @JsonProperty("title")
    @Column (name = "title")
    private String title;

    @JsonProperty("id_integracao")
    @Column(name = "id_integracao", nullable = false)
    private Integer idIntegracao;

    @JsonProperty("subtitle")
    @Column (name = "subtitle")
    private String subtitle;

    @JsonProperty("seller_id")
    @Column(name = "seller_id", nullable = false)
    private Integer sellerId;

    @JsonProperty("price")
    @Column(name = "price", nullable = false)
    private Float price;

    @JsonProperty("base_price")
    @Column(name = "base_price", nullable = false)
    private Float basePrice;

    @JsonProperty("original_price")
    @Column(name = "original_price")
    private Float originalPrice;

    @JsonProperty("currency_id")
    @Column(name = "currency_id", nullable = false)
    private String currencyId;

    @JsonProperty("initial_quantity")
    @Column(name = "initial_quantity", nullable = false)
    private Integer initialQuantity;

    @JsonProperty("available_quantity")
    @Column(name = "available_quantity", nullable = false)
    private Integer availableQuantity;

    @JsonProperty("start_time")
    @Column
    private OffsetDateTime startTime;

    @JsonProperty("stop_time")
    @Column
    private OffsetDateTime stopTime;

    @JsonProperty("condition")
    @Column(name = "conditional", nullable = false)
    private String condition;

    @JsonProperty("permalink")
    @Column(name = "permalink", nullable = false)
    private String permalink;

    @JsonProperty("seller_contact")
    @Column(name = "seller_contact")
    private String sellerContact;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonProperty("attributes")
    private List<Attributes> atributos;

    @ManyToOne
    @JsonProperty("seller_address")
    private SellerAdress sellerAdresses;

    public Produto(){}

    public Produto(String id, String siteId, String title, Integer idIntegracao, String subtitle, Integer sellerId,
                   Float price, Float basePrice, Float originalPrice, String currencyId, Integer initialQuantity,
                   Integer availableQuantity, OffsetDateTime startTime, OffsetDateTime stopTime, String condition,
                   String permalink, String sellerContact, List<Attributes> atributos, SellerAdress sellerAdresses) {
        super();
        this.id = id;
        this.siteId = siteId;
        this.title = title;
        this.idIntegracao = idIntegracao;
        this.subtitle = subtitle;
        this.sellerId = sellerId;
        this.price = price;
        this.basePrice = basePrice;
        this.originalPrice = originalPrice;
        this.currencyId = currencyId;
        this.initialQuantity = initialQuantity;
        this.availableQuantity = availableQuantity;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.condition = condition;
        this.permalink = permalink;
        this.sellerContact = sellerContact;
        this.atributos = atributos;
        this.sellerAdresses = sellerAdresses;
    }


}
