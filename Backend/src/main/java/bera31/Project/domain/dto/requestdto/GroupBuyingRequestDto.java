package bera31.Project.domain.dto.requestdto;

import bera31.Project.domain.page.groupbuying.GroupBuying;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GroupBuyingRequestDto {
    String title;
    String category;
    String product;
    String link;
    String image;
    int price;
    int memberLimit;
    LocalDateTime deadLine;
    String content;
}
