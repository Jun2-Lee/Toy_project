package bera31.Project;

import bera31.Project.domain.comment.Comment;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.ingredient.Meal;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.message.Message;
import bera31.Project.domain.page.Contents;
import bera31.Project.domain.page.groupbuying.GroupBuying;
import bera31.Project.domain.page.intersection.GroupBuyingIntersection;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.net.TLSClientHelloExtractor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

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
            ingredient.setMeal(Meal.돼지고기);
            groupBuying.setUser(member1);
            member1.getBuyingList().add(groupBuying);
            groupBuying.setCategory(ingredient);

            GroupBuyingIntersection groupBuyingIntersection = new GroupBuyingIntersection();

            groupBuyingIntersection.setGroupBuying(groupBuying);
            groupBuyingIntersection.setParticipant(member2);
            member2.getHello().add(groupBuyingIntersection);
            groupBuying.getMemberList().add(groupBuyingIntersection);

            em.persist(groupBuying);
            em.persist(member1);
            em.persist(member2);
            em.persist(message);
            em.persist(groupBuyingIntersection);
            em.persist(ingredient);
        }
    }
}
