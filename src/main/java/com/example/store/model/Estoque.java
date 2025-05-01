package com.example.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name =  "estoque")
public class Estoque {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private Long id;

    private int quantidade;

    @OneToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;   
    public Estoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    

}
