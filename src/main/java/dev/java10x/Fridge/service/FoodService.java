package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
//Classe que faz os metodos
@Service
public class FoodService {

    //injeção de dependencia
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    //LISTAR
    public List<Food> getAll(){return foodRepository.findAll();}
    //CRIAR
    public Food save(Food food){return foodRepository.save(food);}
    //DELETAR
    public void delete(Long id){foodRepository.deleteById(id);}
}
