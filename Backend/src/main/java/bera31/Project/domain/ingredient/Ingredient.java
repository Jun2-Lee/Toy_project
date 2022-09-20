package bera31.Project.domain.ingredient;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Ingredient {
    @Id @GeneratedValue
    @Column(name = "INGREDIENT_ID")
    Long id;

    @Enumerated(EnumType.STRING)
    Fish fish;
    @Enumerated(EnumType.STRING)
    Meal meal;
    @Enumerated(EnumType.STRING)
    Vegetable vegetable;
    @Enumerated(EnumType.STRING)
    Milk milk;
    @Enumerated(EnumType.STRING)
    Snack snack;
    @Enumerated(EnumType.STRING)
    Meat meat;
    @Enumerated(EnumType.STRING)
    Etc etc;
}
