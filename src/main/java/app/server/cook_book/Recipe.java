package app.server.cook_book;
import javax.persistence.*;
import javax.print.DocFlavor;
import java.sql.Blob;

@Entity
@Table(name="recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long recipe_id;
    @Column
    String recipe_name;
    @Column
    String recipe_description;
    @Column
    Byte [] recipe_image;


    public Long getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(Long recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public String getRecipe_description() {
        return recipe_description;
    }

    public void setRecipe_description(String recipe_description) {
        this.recipe_description = recipe_description;
    }

    public Byte[] getRecipe_image() {
        return recipe_image;
    }

    public void setRecipe_image(Byte [] recipe_image) {
        this.recipe_image = recipe_image;
    }
}