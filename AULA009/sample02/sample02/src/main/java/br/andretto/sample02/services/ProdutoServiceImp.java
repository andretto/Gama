package br.andretto.sample02.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.andretto.sample02.dao.ProdutoRepo;
import br.andretto.sample02.model.Produto;
import java.util.List;
@Component
public class ProdutoServiceImp implements IProdutoService {

    @Autowired
    private ProdutoRepo repo;

    @Override
    public Produto buscarProdutoPorId(int cod) {
        return repo.findById(cod).get();
    }
    @Override
    public List<Produto> buscarTodos() {
        return (List<Produto>)repo.findAll();
    }

    
    
}