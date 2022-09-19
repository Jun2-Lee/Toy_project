package bera31.Project.domain.page.intersection;

import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.dutchpay.DutchPay;

import javax.persistence.*;
import java.util.List;

@Entity
public class DutchPayIntersection {
    @Id @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    Member participant;

    @ManyToOne
    @JoinColumn(name = "CONTENTS_ID")
    DutchPay dutchPay;

}
