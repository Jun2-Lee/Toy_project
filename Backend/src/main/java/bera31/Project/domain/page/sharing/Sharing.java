package bera31.Project.domain.page.sharing;

import bera31.Project.domain.Address;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Sharing extends Contents {
    @OneToOne
    Ingredient category;
    LocalDateTime expiry;

    @OneToOne
    Member receiver;
    LocalDateTime deadLine;

    @Embedded
    Address location;
    boolean isFinish;
    @OneToMany(mappedBy = )
    List<Recipes> recommendRecipes;
    String image;
    String content;
}
