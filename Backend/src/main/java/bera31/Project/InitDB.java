package bera31.Project;

import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.ingredient.Meal;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.memo.Memo;
import bera31.Project.domain.memo.MemoCategory;
import bera31.Project.domain.message.Message;
import bera31.Project.domain.page.dutchpay.DutchPay;
import bera31.Project.domain.page.groupbuying.GroupBuying;
import bera31.Project.domain.page.intersection.DutchPayIntersection;
import bera31.Project.domain.page.intersection.GroupBuyingIntersection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;

    @PostConstruct
    public void init(){
        initService.dbInit1();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void dbInit1() {
            GroupBuying groupBuying = new GroupBuying();
            groupBuying.setTitle("무야호");

            Member member1 = new Member();
            member1.setNickname("이설희");
            Member member2 = new Member();
            member2.setNickname("이준희");
            Message message = new Message();
            message.setSender(member1);
            message.setReceiver(member2);

            Ingredient ingredient = new Ingredient();
            groupBuying.setUser(member1);
            member1.getBuyingList().add(groupBuying);
            groupBuying.setCategory(ingredient);

            Memo memo = new Memo();
            memo.setCategory(MemoCategory.DutchPay);
            memo.setTitle("치킨 N빵");
            member1.getMemoList().add(memo);

            GroupBuyingIntersection groupBuyingIntersection = new GroupBuyingIntersection();

            groupBuyingIntersection.setGroupBuying(groupBuying);
            groupBuyingIntersection.setParticipant(member2);
            member2.getGbi().add(groupBuyingIntersection);
            groupBuying.getMemberList().add(groupBuyingIntersection);

            em.persist(groupBuying);
            em.persist(memo);
            em.persist(member1);
            em.persist(member2);
            em.persist(message);
            em.persist(groupBuyingIntersection);
            em.persist(ingredient);
        }
    }
}
