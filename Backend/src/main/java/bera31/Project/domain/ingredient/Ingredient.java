package bera31.Project.domain.ingredient;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Ingredient {
    @Id @GeneratedValue
    @Column(name = "INGREDIENT_ID")
    Long id;
    Fish fish;
    Meal meal;
    Vegetable vegetable;
    Milk milk;
    Snack snack;
    Meat meat;
    Etc etc;
}
