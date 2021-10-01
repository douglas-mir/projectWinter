package com.example.projectwinter.servico.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectwinter.servico.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}