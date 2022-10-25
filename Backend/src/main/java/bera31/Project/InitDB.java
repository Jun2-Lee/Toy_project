package bera31.Project;

import bera31.Project.domain.dto.requestdto.ScheduleDto;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.dutchpay.DutchPay;
import bera31.Project.domain.page.sharing.Sharing;
import bera31.Project.domain.schedule.Schedule;
import bera31.Project.domain.schedule.ScheduleCategory;
import bera31.Project.domain.message.Message;
import bera31.Project.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.time.LocalDateTime;

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
        private final ScheduleService memoService;

        public void dbInit1() {

            Member member1 = new Member();
            member1.setNickname("이설희");
            Member member2 = new Member();
            member2.setNickname("이준희");
            Message message = new Message();
            message.setSender(member1);
            message.setReceiver(member2);
            Sharing sharing = new Sharing();
            DutchPay dutchPay = new DutchPay();
            em.persist(dutchPay);
            em.persist(sharing);

            Schedule memo = new Schedule();
            memo.setCategory(ScheduleCategory.DutchPay);
            memo.setTitle("치킨 N빵");
            member1.addMemo(memo);

            em.persist(member1);
            em.persist(member2);
            em.persist(memo);

            em.flush();
            em.clear();

            ScheduleDto scheduleDto = new ScheduleDto(memo.getId(), ScheduleCategory.Sharing, "나눔", LocalDateTime.now(), "여기", "ㅁㄴㅇㄹ");



        }
    }
}
