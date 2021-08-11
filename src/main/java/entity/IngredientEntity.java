package entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "ingredient", schema = "public", catalog = "CookBook")
public class IngredientEntity {
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
        IngredientEntity that = (IngredientEntity) o;
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
