package com.example.cardapio.dto;

// DTO usado para receber os dados do cliente (requisição POST)
public record FoodRequestDTO(String title, String image, Integer price) {
    // O record já gera automaticamente getters e construtor
}
