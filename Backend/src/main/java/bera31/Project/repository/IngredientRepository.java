package bera31.Project.repository;


import bera31.Project.domain.ingredient.Ingredient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class IngredientRepository {
    private final EntityManager em;

    public Ingredient findById(Long id){
        return em.createQuery("select i from Ingredient i where i.id =:id", Ingredient.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
