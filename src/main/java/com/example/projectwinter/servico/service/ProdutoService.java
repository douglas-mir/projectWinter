package com.example.projectwinter.servico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectwinter.servico.entity.Produto;
import com.example.projectwinter.servico.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }
}
