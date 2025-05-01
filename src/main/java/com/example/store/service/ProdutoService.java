package com.example.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.model.Produto;
import com.example.store.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto create(Produto produto){
       return produtoRepository.save(produto);

    }
    public void desativar(Produto produto){
        produto.setAtivo(false);
        produtoRepository.save(produto);
    }
    public List<Produto> list(){
        return produtoRepository.findAll();
        
    }
    public Produto update(Produto produtoAtualizado){
          Produto produtoExistente = produtoRepository.findById(produtoAtualizado.getID())
        .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

    produtoExistente.setNome(produtoAtualizado.getNome());
    produtoExistente.setDesc(produtoAtualizado.getDesc());
    produtoExistente.setPreco(produtoAtualizado.getPreco());

    return produtoRepository.save(produtoExistente);
    }

}
