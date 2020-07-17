package br.andretto.sample02.controllers;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.andretto.sample02.model.Produto;
import br.andretto.sample02.services.IProdutoService;
import java.util.List;

@RestController
@CrossOrigin("*")
public class ProdutoController {
    @Autowired
    private IProdutoService servico;

    @GetMapping("/produto/{cod}")
    public ResponseEntity<Produto> buscarProdutoPorCod(@PathVariable int cod) {
        Produto prod = servico.buscarProdutoPorId(cod);

        if (prod != null) {
            return ResponseEntity.ok(prod);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/produto")
    public ResponseEntity<List<Produto>> mostrarTodos() {
        return ResponseEntity.ok(servico.buscarTodos());
    }
}