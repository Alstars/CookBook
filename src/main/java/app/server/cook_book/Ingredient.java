package app.server.cook_book;
import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name="ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ingredient_id;
    @Column
    String ingredient_name;
    @Column
    Byte [] ingredient_image;

    public Long getIngredient_id() {
        return ingredient_id;
    }

    public void setIngredient_id(Long ingredient_id) {
        this.ingredient_id = ingredient_id;
    }

    public String getIngredient_name() {
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }

    public Byte [] getIngredient_image() {
        return ingredient_image;
    }

    public void setIngredient_image(Byte [] ingredient_image) {
        this.ingredient_image = ingredient_image;
    }
}
