package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.Venda;

public interface VendaRepository extends JpaRepository<Venda,Long>{
    
}
