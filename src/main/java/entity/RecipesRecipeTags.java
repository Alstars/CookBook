package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "recipes_recipe_tags", schema = "public", catalog = "CookBook")
public class RecipesRecipeTags {
    private Integer recipeTagId;
    private Integer recipeId;
    private int id;

    @Basic
    @Column(name = "recipe_tag_id")
    public Integer getRecipeTagId() {
        return recipeTagId;
    }

    public void setRecipeTagId(Integer recipeTagId) {
        this.recipeTagId = recipeTagId;
    }

    @Basic
    @Column(name = "recipe_id")
    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipesRecipeTags that = (RecipesRecipeTags) o;
        return Objects.equals(recipeTagId, that.recipeTagId) &&
                Objects.equals(recipeId, that.recipeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeTagId, recipeId);
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToMany
    @JoinTable(name="recipe_steps_ingredients", joinColumns = {@JoinColumn(name = "recipe_step_id")}, inverseJoinColumns = {@JoinColumn(name = "ingredient_id")})
    private Set<RecipeStep> recipeSteps = new HashSet<>();
}
