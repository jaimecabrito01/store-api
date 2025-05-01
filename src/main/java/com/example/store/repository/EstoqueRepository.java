package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.store.model.Estoque;
@Repository
public interface EstoqueRepository extends JpaRepository<Estoque,Long>{

    
} 
