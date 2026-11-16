package dev.java10x.Fridge.controller;
import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Classe que controla as requisições
@RestController
@RequestMapping("/food")
public class FoodController {

    //injeção de dependencia (Se conecta com outra classe)
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    //GET Pega uma rota pras informações
    //POST
    //PUT
    //DELETE

    @GetMapping //Lista todas as comidas (Listagem)
    public List<Food> getAll() {return foodService.getAll();}

    @PostMapping
    public Food creat(@RequestBody Food food) {return foodService.save(food);}

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {foodService.delete(id);}
}
