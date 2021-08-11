package app.server.cook_book;

import javax.persistence.*;

@Entity
@Table(name="step")
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long recipe_id;
    @Column
    String description;

    @ManyToOne(mappedBy="recipes")
    public Set<>

    public Long getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(Long recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}