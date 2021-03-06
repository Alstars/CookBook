package entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "recipe_steps_ingredients", schema = "public", catalog = "CookBook")
public class RecipeStepsIngredients {
    private int recipeStepId;
    private int recipeStepNumber;
    private String recipeStepInstructions;
    private byte[] recipeStepImage;
    private Integer recipeStep;
    private Integer ingredient;

    @Id
    @Column(name = "recipe_step_id")
    public int getRecipeStepId() {
        return recipeStepId;
    }

    public void setRecipeStepId(int recipeStepId) {
        this.recipeStepId = recipeStepId;
    }

    @Basic
    @Column(name = "recipe_step_number")
    public int getRecipeStepNumber() {
        return recipeStepNumber;
    }

    public void setRecipeStepNumber(int recipeStepNumber) {
        this.recipeStepNumber = recipeStepNumber;
    }

    @Basic
    @Column(name = "recipe_step_instructions")
    public String getRecipeStepInstructions() {
        return recipeStepInstructions;
    }

    public void setRecipeStepInstructions(String recipeStepInstructions) {
        this.recipeStepInstructions = recipeStepInstructions;
    }

    @Basic
    @Column(name = "recipe_step_image")
    public byte[] getRecipeStepImage() {
        return recipeStepImage;
    }

    public void setRecipeStepImage(byte[] recipeStepImage) {
        this.recipeStepImage = recipeStepImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeStepsIngredients that = (RecipeStepsIngredients) o;
        return recipeStepId == that.recipeStepId &&
                recipeStepNumber == that.recipeStepNumber &&
                Objects.equals(recipeStepInstructions, that.recipeStepInstructions) &&
                Arrays.equals(recipeStepImage, that.recipeStepImage);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(recipeStepId, recipeStepNumber, recipeStepInstructions);
        result = 31 * result + Arrays.hashCode(recipeStepImage);
        return result;
    }

    @Basic
    @Column(name = "recipe_step")
    public Integer getRecipeStep() {
        return recipeStep;
    }

    public void setRecipeStep(Integer recipeStep) {
        this.recipeStep = recipeStep;
    }

    @Basic
    @Column(name = "ingredient")
    public Integer getIngredient() {
        return ingredient;
    }

    public void setIngredient(Integer ingredient) {
        this.ingredient = ingredient;
    }
}
