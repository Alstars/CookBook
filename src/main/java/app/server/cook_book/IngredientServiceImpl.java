package app.server.cook_book;

import entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService{

    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientServiceImpl (IngredientRepository ingredientRepository)
    {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> getIngredients(){
        return ingredientRepository.findAll();
    }
}
