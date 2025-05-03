package com.example.store.DTO;

public class EstoqueDTO {
  private Long id;
  private int quantidade;
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
  public EstoqueDTO() {
  }
  public EstoqueDTO(Long id, int quantidade) {
    this.id = id;
    this.quantidade = quantidade;
  }
  
  
}
