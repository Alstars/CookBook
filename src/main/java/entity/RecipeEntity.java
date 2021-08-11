package entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "recipe", schema = "public", catalog = "CookBook")
public class RecipeEntity {
    private int recipeId;
    private String recipeName;
    private String recipeDescription;
    private byte[] recipeImage;

    @Id
    @Column(name = "recipe_id")
    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    @Basic
    @Column(name = "recipe_name")
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    @Basic
    @Column(name = "recipe_description")
    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    @Basic
    @Column(name = "recipe_image")
    public byte[] getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(byte[] recipeImage) {
        this.recipeImage = recipeImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeEntity that = (RecipeEntity) o;
        return recipeId == that.recipeId &&
                Objects.equals(recipeName, that.recipeName) &&
                Objects.equals(recipeDescription, that.recipeDescription) &&
                Arrays.equals(recipeImage, that.recipeImage);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(recipeId, recipeName, recipeDescription);
        result = 31 * result + Arrays.hashCode(recipeImage);
        return result;
    }
}
