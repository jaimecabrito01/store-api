package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.ItemVenda;

public interface ItemVendaRepositor extends JpaRepository<ItemVenda,Long> {

    
}