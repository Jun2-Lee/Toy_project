package bera31.Project;

import bera31.Project.domain.Address;
import bera31.Project.domain.dto.requestdto.SharingRequestDto;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.sharing.Sharing;
import bera31.Project.domain.message.Message;
import bera31.Project.service.page.SharingService;
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
        private final SharingService sharingService;

        public void dbInit1() {
            Member member1 = new Member();
            member1.setNickname("이설희");
            Member member2 = new Member();
            member2.setNickname("이준희");
            Message message = new Message();
            message.setSender(member1);
            message.setReceiver(member2);

            Address address = new Address();

            SharingRequestDto sharingRequestDto = new SharingRequestDto("나눔??", "나눔할거요", "육류", "소고기", LocalDateTime.now(),
            LocalDateTime.now(), LocalDateTime.now(), address, "");

            Sharing sharing = new Sharing(sharingRequestDto);
            em.persist(sharing);

            member1.addSharing(sharing);
//            sharingService.deleteSharing(sharing.getId());

            em.persist(member1);
            em.persist(member2);

            em.flush();
            em.clear();
        }
    }
}
