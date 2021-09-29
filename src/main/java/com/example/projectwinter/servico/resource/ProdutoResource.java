package com.example.projectwinter.servico.resource;


import com.example.projectwinter.servico.entity.Produto;
import com.example.projectwinter.servico.repository.ProdutoRepository;
import com.example.projectwinter.servico.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/winter")
public class ProdutoResource {

    private final ProdutoRepository produtoRepository;

    private final ProdutoService produtoService;


    public ProdutoResource(ProdutoRepository produtoRepository, ProdutoService produtoService) {
        this.produtoRepository = produtoRepository;
        this.produtoService = produtoService;
    }
//    @GetMapping("/consulta/{id}")
//    public Aluno consulta(@PathVariable("id") int id){
//        return alunoRepository.getById(id);
//    }
//
//    @DeleteMapping("/consulta/{id}")
//    public ResponseEntity delete(@PathVariable("id") int id){
//        alunoRepository.deleteById(id);
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping
//    public List<Aluno> listar(){
//        return alunoRepository.findAll();
//    }

    @PostMapping
    public Produto incluir(@RequestBody(required = false) Produto produto){
        return produtoService.save(produto);
    }
}
