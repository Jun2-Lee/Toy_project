package bera31.Project.domain.page.groupbuying;

import bera31.Project.domain.dto.requestdto.GroupBuyingRequestDto;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import bera31.Project.domain.page.intersection.GroupBuyingIntersection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GroupBuying extends Contents {
    String link;
    String category;
    String product;
    LocalDateTime deadLine;
    String content;
    int cost;
    String image;
    int limitMember;

    @OneToMany(mappedBy = "groupBuying")
    List<GroupBuyingIntersection> memberList = new ArrayList<>();
    boolean isFinish;

    public void setImage(String image){
        this.image = image;
    }
    public Long update(GroupBuyingRequestDto groupBuyingRequestDto) {
        this.cost = groupBuyingRequestDto.getPrice();
        this.limitMember = groupBuyingRequestDto.getMemberLimit();
        this.content = groupBuyingRequestDto.getContent();
        this.product = groupBuyingRequestDto.getProduct();
        this.deadLine = groupBuyingRequestDto.getDeadLine();
        this.link = groupBuyingRequestDto.getLink();
        this.title = groupBuyingRequestDto.getTitle();
        return this.getId();
    }

    public GroupBuying(GroupBuyingRequestDto groupBuyingRequestDto, Member member) {
        this.user = member;
        this.cost = groupBuyingRequestDto.getPrice();
        this.limitMember = groupBuyingRequestDto.getMemberLimit();
        this.content = groupBuyingRequestDto.getContent();
        this.isFinish = false;
        this.category = groupBuyingRequestDto.getCategory();
        this.product = groupBuyingRequestDto.getProduct();
        this.deadLine = groupBuyingRequestDto.getDeadLine();
        this.postTime = LocalDateTime.now();
        this.link = groupBuyingRequestDto.getLink();
        this.title = groupBuyingRequestDto.getTitle();
    }
}
