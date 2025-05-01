package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
