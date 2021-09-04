package app.server.cook_book;

import entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ingredients")
public class IngredientController {

    private IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService){
        this.ingredientService = ingredientService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient createIngredient(@RequestBody Ingredient ingredient){
        return (ingredientService.createIngredient(ingredient));
    }


}
