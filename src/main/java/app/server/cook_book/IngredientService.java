package app.server.cook_book;

import entity.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> getIngredients();
    Ingredient createIngredient(Ingredient ingredient);
}
