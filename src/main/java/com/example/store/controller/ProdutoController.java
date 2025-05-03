package com.example.store.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.store.model.Produto;
import com.example.store.service.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/all")
    public List<Produto> list(){
        return produtoService.list();
    }
    @PostMapping("/create")
    public ResponseEntity<Produto> create(@RequestParam Produto produto){
    
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.create(produto));
    }

    
}
