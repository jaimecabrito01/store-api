package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque,Long>{

    
} 
