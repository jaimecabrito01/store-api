package com.example.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.model.Estoque;
import com.example.store.repository.EstoqueRepository;

@Service
public class EstoqueService {
    @Autowired
    private EstoqueRepository estoqueRepository;

    public Estoque addProduto(Estoque estoque){
        return estoqueRepository.save(estoque);

    }
    public void retirarProd(Estoque estoque){
        estoqueRepository.delete(estoque);
    }
    public Estoque editarProduto(Estoque estoque){
       Estoque estoque2 = estoqueRepository.findById(estoque.getId())
        .orElseThrow(()-> new RuntimeException("Produto nao encontrado no estoque"));
        estoque2.setProduto(estoque.getProduto());
        estoque2.setQuantidade(estoque.getQuantidade());
        return estoque2;

    }
    public List<Estoque> listProdutos(){
        return estoqueRepository.findAll();
    }
    
}
