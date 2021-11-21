package com.example.projectwinter.servico.repository;


import com.example.projectwinter.servico.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    @Query("SELECT produto FROM Produto produto WHERE produto.id = ?1")
    List<Produto> listById(String id);

}