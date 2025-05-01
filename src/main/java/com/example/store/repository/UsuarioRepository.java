package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    
}
