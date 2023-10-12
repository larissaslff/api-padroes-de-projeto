package com.padroes.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.padroes.demo.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
