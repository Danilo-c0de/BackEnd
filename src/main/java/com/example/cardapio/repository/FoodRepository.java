package com.example.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardapio.entity.Food;

//Aqui a gente cria um jeito fácil de mexer no banco de dados para a tabela de comidas (Food).
//salvar, procurar, apagar comida e etc 
//Food é o tipo da tabela, e Long é o tipo do identificador dela (ID).
public interface FoodRepository extends JpaRepository<Food, Long> {

}
