package bera31.Project.domain.page.groupbuying;

import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class GroupBuying extends Contents {
    String title;
    String productName;
    String link;
    Ingredient category;
    LocalDateTime deadLine;
    String content;
    int cost;
    String image;
    int limitMember;
    List<Member> memberList;
    boolean isFinish;
}
