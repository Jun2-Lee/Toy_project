package bera31.Project.domain.page.dutchpay;

import bera31.Project.domain.page.Contents;
import bera31.Project.domain.page.intersection.DutchPayIntersection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DutchPay extends Contents {
    Category category;
    String store;
    int deliveryCost;
    int limitMember;

    @OneToMany(mappedBy = "dutchPay")
    List<DutchPayIntersection> memberList = new ArrayList<>();

    double x;
    double y;
    LocalDateTime deadLine;
    String content;

    public DutchPay(String title, Category category, String store, int deliveryCost,
                    int limitMember, String content, double x, double y, LocalDateTime deadLine) {
        this.title = title;
        this.category = category;
        this.store = store;
        this.deliveryCost = deliveryCost;
        this.limitMember = limitMember;
        this.x = x; this.y = y;
        this.deadLine = deadLine;
        this.content = content;
    }
}
