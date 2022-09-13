package bera31.Project.domain.page.sharing;

import bera31.Project.domain.ingredient.Ingredient;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipes {
    @Id @GeneratedValue
    @Column(name = "RECIPES_ID")
    Long id;
    List<Sharing> sharingList;
    String title;
    List<Ingredient> mainIngredient;
}
