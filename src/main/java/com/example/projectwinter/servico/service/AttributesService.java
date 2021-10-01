package com.example.projectwinter.servico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectwinter.servico.entity.Attributes;
import com.example.projectwinter.servico.repository.AttributesRepository;

@Service
public class AttributesService {

    @Autowired
    private AttributesRepository attributesRepository;

    public Attributes save(Attributes attributes){
        return attributesRepository.save(attributes);
    }
}
