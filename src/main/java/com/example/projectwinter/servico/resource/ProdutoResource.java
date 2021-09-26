package com.example.projectwinter.servico.resource;


import com.example.projectwinter.servico.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    private final ProdutoRepository produtoRepository;

    private final ProdutoService produtoService;

    public ProdutoResource(ProdutoRepository produtoRepository, ProdutoService);

}
