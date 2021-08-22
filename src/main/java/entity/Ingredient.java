package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Ingredient {
    private int ingredientId;
    private String ingredientName;
    private byte[] ingredientImage;

    @Id
    @Column(name = "ingredient_id")
    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    @Basic
    @Column(name = "ingredient_name")
    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Basic
    @Column(name = "ingredient_image")
    public byte[] getIngredientImage() {
        return ingredientImage;
    }

    public void setIngredientImage(byte[] ingredientImage) {
        this.ingredientImage = ingredientImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return ingredientId == that.ingredientId &&
                Objects.equals(ingredientName, that.ingredientName) &&
                Arrays.equals(ingredientImage, that.ingredientImage);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ingredientId, ingredientName);
        result = 31 * result + Arrays.hashCode(ingredientImage);
        return result;
    }
}
