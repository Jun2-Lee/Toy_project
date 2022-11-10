package bera31.Project.domain.dto.responsedto;

import bera31.Project.domain.page.dutchpay.Category;
import bera31.Project.domain.page.dutchpay.DutchPay;

import java.time.LocalDateTime;

public class DutchPayResponseDto {

    Long id;
    String store;
    Category category;
    int deliveryCost;
    int limitMember;
    double x;
    double y;
    LocalDateTime deadLine;
    String content;
    int currentMember;

    public DutchPayResponseDto(DutchPay dutchPay) {
        this.id = dutchPay.getId();
        this.store = dutchPay.getStore();
        this.category = dutchPay.getCategory();
        this.deliveryCost = dutchPay.getDeliveryCost();
        this.limitMember = dutchPay.getLimitMember();
        this.currentMember = dutchPay.getMemberList().size();
        this.deadLine = dutchPay.getDeadLine();
        this.x = dutchPay.getX();
        this.y = dutchPay.getY();
        this.content = dutchPay.getContent();
    }
}
