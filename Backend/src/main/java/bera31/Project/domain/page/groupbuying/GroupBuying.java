package bera31.Project.domain.page.groupbuying;

import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class GroupBuying extends Contents {
    String title;
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

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    List<Member> memberList;
    boolean isFinish;
}
