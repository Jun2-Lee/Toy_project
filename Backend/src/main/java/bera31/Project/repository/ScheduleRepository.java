package bera31.Project.repository;

import bera31.Project.domain.schedule.Schedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class ScheduleRepository {

    private final EntityManager em;

    public Schedule save(Schedule memo) {
        em.persist(memo);
        return memo;
    }

    public void delete(Schedule memo) {
        em.remove(memo);
        return;
    }

    public Schedule findById(Long id) {
        return em.createQuery("select m from Schedule m where m.id =:id", Schedule.class)
                .setParameter("id", id)
                .getSingleResult();
    }


}
