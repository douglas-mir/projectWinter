package com.example.projectwinter.servico.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectwinter.servico.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

    State findByName(String name);
}