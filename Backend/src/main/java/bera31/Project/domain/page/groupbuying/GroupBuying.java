package bera31.Project.domain.page.groupbuying;

import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import bera31.Project.domain.page.intersection.GroupBuyingIntersection;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class GroupBuying extends Contents {
    String productName;
    String link;

    @OneToOne
    @JoinColumn(name = "INGREDIENT_ID")
    Ingredient category;
    LocalDateTime deadLine;
    String content;
    int cost;
    String image;
    int limitMember;

    @OneToMany(mappedBy = "groupBuying")
    List<GroupBuyingIntersection> memberList = new ArrayList<>();
    boolean isFinish;
}
