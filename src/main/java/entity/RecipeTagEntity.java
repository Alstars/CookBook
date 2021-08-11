package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "recipe_tag", schema = "public", catalog = "CookBook")
public class RecipeTagEntity {
    private int recipeTagId;
    private String recipeTagName;
    private String recipeTagGroup;

    @Id
    @Column(name = "recipe_tag_id")
    public int getRecipeTagId() {
        return recipeTagId;
    }

    public void setRecipeTagId(int recipeTagId) {
        this.recipeTagId = recipeTagId;
    }

    @Basic
    @Column(name = "recipe_tag_name")
    public String getRecipeTagName() {
        return recipeTagName;
    }

    public void setRecipeTagName(String recipeTagName) {
        this.recipeTagName = recipeTagName;
    }

    @Basic
    @Column(name = "recipe_tag_group")
    public String getRecipeTagGroup() {
        return recipeTagGroup;
    }

    public void setRecipeTagGroup(String recipeTagGroup) {
        this.recipeTagGroup = recipeTagGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeTagEntity that = (RecipeTagEntity) o;
        return recipeTagId == that.recipeTagId &&
                Objects.equals(recipeTagName, that.recipeTagName) &&
                Objects.equals(recipeTagGroup, that.recipeTagGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeTagId, recipeTagName, recipeTagGroup);
    }
}
