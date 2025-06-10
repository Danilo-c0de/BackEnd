// Pacote principal da aplicação
package com.example.cardapio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marca esta classe como a principal da aplicação Spring Boot
@SpringBootApplication
public class CardapioApplication {

	// Método que inicia a aplicação
	public static void main(String[] args) {
		SpringApplication.run(CardapioApplication.class, args);
	}
}
