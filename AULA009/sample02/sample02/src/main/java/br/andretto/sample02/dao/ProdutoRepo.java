package br.andretto.sample02.dao;

import org.springframework.data.repository.CrudRepository;

import br.andretto.sample02.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {
    
    
}