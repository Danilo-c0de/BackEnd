package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.dto.FoodRequestDTO;
import com.example.cardapio.dto.FoodResponseDTO;
import com.example.cardapio.entity.Food;
import com.example.cardapio.repository.FoodRepository;

@RestController // Define que essa classe é um controlador REST
@RequestMapping("food") // Define o caminho base "/food"
public class FoodController {

	@Autowired // Injeta o repositório de Food
	private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*") // Libera requisições de qualquer origem
    @PostMapping // Rota POST para salvar um alimento
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data); // Converte DTO em entidade
        repository.save(foodData); // Salva no banco
    }
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping // Rota GET para listar todos os alimentos
    public List<FoodResponseDTO> getAll(){
        return repository.findAll()
                         .stream()
                         .map(FoodResponseDTO::new) // Converte entidade para DTO
                         .toList(); // Retorna a lista
    }
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        repository.deleteById(id);
    }
    

    
    
}
	