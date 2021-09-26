package com.example.projectwinter.servico.service;

import com.example.projectwinter.servico.entity.Produto;
import com.example.projectwinter.servico.repository.ProdutoRepository;
import com.example.projectwinter.servico.resource.ProdutoResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }
}
