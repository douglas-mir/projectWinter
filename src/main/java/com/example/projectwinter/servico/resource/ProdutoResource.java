package com.example.projectwinter.servico.resource;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.projectwinter.servico.entity.Attributes;
import com.example.projectwinter.servico.entity.City;
import com.example.projectwinter.servico.entity.Country;
import com.example.projectwinter.servico.entity.Produto;
import com.example.projectwinter.servico.entity.SellerAdress;
import com.example.projectwinter.servico.entity.State;
import com.example.projectwinter.servico.repository.AttributesRepository;
import com.example.projectwinter.servico.repository.CityRepository;
import com.example.projectwinter.servico.repository.CountryRepository;
import com.example.projectwinter.servico.repository.ProdutoRepository;
import com.example.projectwinter.servico.repository.SellerRepository;
import com.example.projectwinter.servico.repository.StateRepository;
import com.example.projectwinter.servico.service.ProdutoService;

@RestController
@RequestMapping("/winter")
public class ProdutoResource {

    private final ProdutoRepository produtoRepository;
    private final AttributesRepository attributesRepository;
    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;
    private final StateRepository stateRepository;
    private final SellerRepository sellerRepository;

    private final ProdutoService produtoService;

    public ProdutoResource(ProdutoRepository produtoRepository, AttributesRepository attributesRepository,
                           CountryRepository countryRepository, CityRepository cityRepository, StateRepository stateRepository,
                           SellerRepository sellerRepository, ProdutoService produtoService) {
        super();
        this.produtoRepository = produtoRepository;
        this.attributesRepository = attributesRepository;
        this.countryRepository = countryRepository;
        this.cityRepository = cityRepository;
        this.stateRepository = stateRepository;
        this.sellerRepository = sellerRepository;
        this.produtoService = produtoService;
    }

    @GetMapping("/{id}")
    public Produto consulta(@PathVariable("id") int id){
        return produtoRepository.findById(id).get();
    }

    @GetMapping()
    public List<Produto> consulta(){
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto incluir(@RequestBody Produto produto){
        if(produto.getAtributos() != null && produto.getAtributos().size() > 0) {
            List<Attributes> atributos = attributesRepository.saveAll(produto.getAtributos());
            produto.getAtributos().clear();
            produto.getAtributos().addAll(atributos);
        }

        if(produto.getSellerAdresses() != null) {
            City city = cityRepository.save(produto.getSellerAdresses().getCity());
            State state = stateRepository.save(produto.getSellerAdresses().getState());
            Country country = countryRepository.save(produto.getSellerAdresses().getCountry());

            produto.getSellerAdresses().setCity(city);
            produto.getSellerAdresses().setState(state);
            produto.getSellerAdresses().setCountry(country);

            SellerAdress seller = produto.getSellerAdresses();
            seller = sellerRepository.save(seller);

            produto.setSellerAdresses(seller);
        }

        return produtoService.save(produto);
    }
    @DeleteMapping("/{id}")
    public void excluir(@RequestBody int id){
        Produto produto = produtoRepository.findById(id).get();

    }
}
