package com.example.projectwinter.servico.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.projectwinter.servico.entity.SellerAdress;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<SellerAdress, Integer> {
    @Query("SELECT s FROM SellerAdress s WHERE s.id = ?1")
    List<SellerAdress> listById(String id);
}