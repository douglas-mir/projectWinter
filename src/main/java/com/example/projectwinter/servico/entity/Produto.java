package com.example.projectwinter.servico.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Table(name = "produto")
@JsonIgnoreProperties({"hibernateLazyInitializer",})

public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "site_id", nullable = false)
    private Integer siteId;

    @Column
    private String title;

    @Column(name = "site_id", nullable = false)
    private Integer idIntegracao;

    @Column
    private String subtitle;

    @Column(name = "seller_id", nullable = false)
    private Integer sellerId;

    @Column(nullable = false)
    private Float price;

    @Column(name = "base_price", nullable = false)
    private Float basePrice;

    @Column(name = "original_price")
    private Float originalPrice;

    @Column(name = "currency_id)", nullable = false)
    private String currencyId;

    @Column(name = "initial_quantity", nullable = false)
    private Integer initialQuantity;

    @Column(name = "available_quantity", nullable = false)
    private Integer availableQuantity;

    @Column(name = "start_time", nullable = false)
    private Timestamp startTime;

    @Column(name = "stop_time", nullable = false)
    private Timestamp stopTime;

    @Column(nullable = false)
    private String condition;

    @Column(nullable = false)
    private String permalink;

    @Column(name = "seller_contact")
    private String sellerContact;

    public Produto(Integer id, Integer siteId, String title, Integer idIntegracao, String subtitle, Integer sellerId, Float price, Float basePrice,
                   Float originalPrice, String currencyId, Integer initialQuantity, Integer availableQuantity, Timestamp startTime, Timestamp stopTime,
                   String condition, String permalink, String sellerContact) {
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
    }

    public Produto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
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

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getStopTime() {
        return stopTime;
    }

    public void setStopTime(Timestamp stopTime) {
        this.stopTime = stopTime;
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


}
