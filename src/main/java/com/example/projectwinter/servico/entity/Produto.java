package com.example.projectwinter.servico.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


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

    @ManyToMany
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIdIntegracao() {
        return idIntegracao;
    }

    public void setIdIntegracao(Integer idIntegracao) {
        this.idIntegracao = idIntegracao;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Float basePrice) {
        this.basePrice = basePrice;
    }

    public Float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(Integer initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getSellerContact() {
        return sellerContact;
    }

    public void setSellerContact(String sellerContact) {
        this.sellerContact = sellerContact;
    }

    public List<Attributes> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Attributes> atributos) {
        this.atributos = atributos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public OffsetDateTime getStopTime() {
        return stopTime;
    }

    public void setStopTime(OffsetDateTime stopTime) {
        this.stopTime = stopTime;
    }

    public SellerAdress getSellerAdresses() {
        return sellerAdresses;
    }

    public void setSellerAdresses(SellerAdress sellerAdresses) {
        this.sellerAdresses = sellerAdresses;
    }

}
