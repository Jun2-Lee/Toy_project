package bera31.Project.domain.dto.requestdto;

import bera31.Project.domain.page.dutchpay.Category;
import bera31.Project.domain.page.dutchpay.DutchPay;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DutchPayRequestDto {
    String title;
    String category;
    String store;
    int deliveryCost;
    int limitMember;
    LocalDateTime deadLine;
    String content;
    double x;
    double y;

    public DutchPay toDutchPay() {
        return new DutchPay(this.title, this.category, this.store, this.deliveryCost,
                this.limitMember, this.content, this.x, this.y, this.deadLine);
    }
}
