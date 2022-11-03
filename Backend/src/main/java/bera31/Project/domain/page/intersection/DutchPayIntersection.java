package bera31.Project.domain.page.intersection;

import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.dutchpay.DutchPay;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DutchPayIntersection {
    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "PARTICIPANT_ID")
    Member participant;

    @ManyToOne
    @JoinColumn(name = "CONTENTS_ID")
    DutchPay dutchPay;

}
