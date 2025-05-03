package com.example.store.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.store.DTO.EstoqueDTO;
import com.example.store.model.Estoque;
import com.example.store.model.Produto;
import com.example.store.repository.ProdutoRepository;
import com.example.store.service.EstoqueService;

@Controller
@RequestMapping("/estoque")
public class EstoqueController {
    @Autowired
    private EstoqueService estoqueService;

    

    @GetMapping("/all")
    public List<Estoque> getAll(){
        return estoqueService.listProdutos();
    }
    @PostMapping("/add")
    public ResponseEntity<Estoque> create(@RequestBody EstoqueDTO dto){
   

        Estoque estoque = new Estoque(dto.getId(),dto.getQuantidade());
        estoqueService.addProduto(estoque);
        return ResponseEntity.status(HttpStatus.CREATED).body(estoque);
    }

}
