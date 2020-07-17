package br.andretto.sample02.services;

import br.andretto.sample02.model.Produto;

import java.util.List;
public interface IProdutoService {
    public Produto buscarProdutoPorId(int cod);
    public List<Produto> buscarTodos();



    
}