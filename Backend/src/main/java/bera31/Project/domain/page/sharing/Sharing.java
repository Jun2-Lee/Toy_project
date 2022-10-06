package bera31.Project.domain.page.sharing;

import bera31.Project.domain.Address;
import bera31.Project.domain.dto.page.SharingUpdateDto;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Sharing extends Contents {
    @OneToOne
    @JoinColumn(name="INGREDIENT_ID")
    Ingredient category;
    LocalDateTime expiry;

    @OneToOne
    @JoinColumn
    Member receiver;
    LocalDateTime deadLine;

    @Embedded
    Address location;

    boolean isFinish;

    @OneToMany
    @JoinColumn(name = "RECIPES_ID")
    List<Recipes> recommendRecipes;

    String image;
    String content;


    public void updateSharing(SharingUpdateDto sharing){
        this.title = sharing.getTitle();
        this.content = sharing.getContent();
        this.category = sharing.getCategory();
        this.expiry = sharing.getExpiry();
        this.deadLine = sharing.getDeadLine();
        this.image = sharing.getImage();
    }
}
