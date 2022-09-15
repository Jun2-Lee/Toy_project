package bera31.Project.domain.page.dutchpay;

import bera31.Project.domain.ingredient.Meat;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class DutchPay extends Contents {
    Category category;
    String store;
    int deliveryCost;
    int limitMember;

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    List<Member> memberList;
    double x;
    double y;
    LocalDateTime deadLine;
    String content;

}
