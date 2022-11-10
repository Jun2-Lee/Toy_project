package bera31.Project.domain.dto.requestdto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class GroupBuyingRequestDto {
    String title;
    String ingredient;
    String category;
    String productName;
    String link;
    String image;
    int price;
    int memberLimit;
    LocalDateTime deadLine;
    String content;

    /*public Ingredient findIngredient(String ingredient, String category){
        if(ingredient == "해산물"){

        }
        else if(ingredient == "육류"){

        }
        else if(ingredient == "곡류"){

        }
        else if(ingredient == "유제품"){

        }
        else if(ingredient == "간식"){

        }
        else if(ingredient == "채소"){

        }
        else if(ingredient == "기타"){

        }

    }*/
}
