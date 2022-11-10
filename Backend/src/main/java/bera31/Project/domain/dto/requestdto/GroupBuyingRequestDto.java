package bera31.Project.domain.dto.requestdto;

<<<<<<< HEAD
=======
import bera31.Project.domain.page.groupbuying.GroupBuying;
>>>>>>> main
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class GroupBuyingRequestDto {
    String title;
    String ingredient;
    String category;
    String product;
    String link;
    String image;
    int price;
    int memberLimit;
    LocalDateTime deadLine;
    String content;
}
