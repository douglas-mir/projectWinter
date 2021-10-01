package com.example.projectwinter.servico.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectwinter.servico.entity.Attributes;

@Repository
public interface AttributesRepository extends JpaRepository<Attributes, Integer> {

//	List<Attributes> findAllByProdutoId(String id);

}