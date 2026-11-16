package dev.java10x.Fridge.repository;

import dev.java10x.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
//Classe que conecta com o banco de dados e conta as ações
//Pega todos os metodos do Jpa
public interface FoodRepository extends JpaRepository<Food, Long> {
}
