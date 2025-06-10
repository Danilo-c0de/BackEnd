// Pacote da classe
package com.example.cardapio.dto;

// Importa a entidade Food
import com.example.cardapio.entity.Food;

// DTO de resposta com campos imutáveis
public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    // Construtor que converte um objeto Food em FoodResponseDTO
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
