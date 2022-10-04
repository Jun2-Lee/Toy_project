package bera31.Project.domain.dto.page;

import bera31.Project.domain.Address;
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
public class SharingDto {
    String title;
    String content;
    Ingredient category;
    LocalDateTime expiry;
    LocalDateTime deadLine;
    Address location;
    String image;

    @Builder
    public Sharing toSharing(){
        return Sharing.builder()
                .title(title)
                .category(category)
                .expiry(expiry)
                .deadLine(deadLine)
                .location(location)
                .content(content)
                .image(image)
                .isFinish(false).build();
    }
}
