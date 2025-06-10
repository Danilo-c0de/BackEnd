// Define o pacote onde essa classe está localizada
package com.example.cardapio.entity;

// Importa a classe DTO que será usada para criar objetos Food a partir dos dados de requisição
import com.example.cardapio.dto.FoodRequestDTO;

// Anotações para JPA (Java Persistence API) que ajudam no mapeamento objeto-relacional
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// Anotações do Lombok que geram automaticamente código como getters, construtores, etc.
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods") // Define o nome da tabela no banco de dados como "foods"
@Entity(name = "foods") // Define essa classe como uma entidade JPA mapeada para a tabela "foods"
@Getter // Gera automaticamente os métodos getters para todos os atributos da classe
@NoArgsConstructor // Gera um construtor sem argumentos
@AllArgsConstructor // Gera um construtor com todos os argumentos
@EqualsAndHashCode(of = "id") // Gera os métodos equals() e hashCode() baseados apenas no campo "id"
public class Food {

    @Id // Define o campo "id" como a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o valor de "id" será gerado automaticamente pelo banco (auto-incremento)
    private Long id;

    // Campos que representam os dados do alimento
    private String title;  // Nome ou título do prato
    private String image;  // URL da imagem do prato
    private Integer price; // Preço do prato em centavos (por exemplo, 1299 representa R$12,99)

    // Construtor que cria um objeto Food com base em um objeto FoodRequestDTO
    // Esse construtor é usado para facilitar a criação da entidade a partir dos dados enviados pelo cliente (por exemplo, via API REST)
    public Food(FoodRequestDTO data){
        this.image = data.image();  // Copia a URL da imagem do DTO
        this.price = data.price();  // Copia o preço do DTO
        this.title = data.title();  // Copia o título do DTO
    }

	public Integer getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
}
