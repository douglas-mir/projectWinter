package com.example.projectwinter.servico.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="userlogin")

public class UserLogin implements Serializable {

    private static final long serialVersionUID = -7715129504957730985L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String username;
    private String password;

}
