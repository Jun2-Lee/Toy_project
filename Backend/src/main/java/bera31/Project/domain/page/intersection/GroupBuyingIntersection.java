package bera31.Project.domain.page.intersection;

import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.dutchpay.DutchPay;
import bera31.Project.domain.page.groupbuying.GroupBuying;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class GroupBuyingIntersection {
    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "PARTICIPANT_ID")
    Member participant;

    @ManyToOne
    @JoinColumn(name = "CONTENTS_ID")
    GroupBuying groupBuying;
}
