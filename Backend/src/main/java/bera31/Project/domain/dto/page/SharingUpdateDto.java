package bera31.Project.domain.dto.page;

import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.page.sharing.Sharing;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@AllArgsConstructor
public class SharingUpdateDto {
    String title;
    String content;
    Ingredient category;
    LocalDateTime expiry;
    LocalDateTime deadLine;
    String image;

    @Builder
    public Sharing updateSharing(){
        return Sharing.builder()
                .title(title)
                .content(content)
                .category(category)
                .expiry(expiry)
                .deadLine(deadLine)
                .image(image).build();
    }

}
