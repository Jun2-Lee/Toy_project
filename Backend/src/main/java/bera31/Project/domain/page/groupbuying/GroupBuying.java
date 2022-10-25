package bera31.Project.domain.page.groupbuying;

import bera31.Project.domain.dto.requestdto.GroupBuyingRequestDto;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import bera31.Project.domain.page.intersection.GroupBuyingIntersection;
import jdk.jfr.BooleanFlag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
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

    public GroupBuying(GroupBuyingRequestDto groupBuyingRequestDto){
        this.cost = groupBuyingRequestDto.getPrice();
        this.limitMember = groupBuyingRequestDto.getMemberLimit();
        this.content = groupBuyingRequestDto.getContent();
        this.isFinish = false;
        this.productName = groupBuyingRequestDto.getProductName();
        this.deadLine = groupBuyingRequestDto.getDeadLine();
        this.postTime = LocalDateTime.now();
        this.link = groupBuyingRequestDto.getLink();
        this.image = groupBuyingRequestDto.getImage();
        this.title = groupBuyingRequestDto.getTitle();
    }
}
