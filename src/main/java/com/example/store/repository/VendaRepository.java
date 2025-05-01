package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.store.model.Venda;
@Repository
public interface VendaRepository extends JpaRepository<Venda,Long>{
    
}
