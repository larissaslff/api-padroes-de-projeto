package com.padroes.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.padroes.demo.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
