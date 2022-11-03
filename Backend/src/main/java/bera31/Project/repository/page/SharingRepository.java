package bera31.Project.repository.page;

import bera31.Project.domain.page.groupbuying.GroupBuying;
import bera31.Project.domain.page.sharing.Sharing;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SharingRepository {

    private final EntityManager em;

    public Sharing save(Sharing sharing) {
        em.persist(sharing);
        return sharing;
    }

    public void delete(Sharing sharing) {
        em.remove(sharing);
        return;
    }

    public List<Sharing> findAll() {
        return em.createQuery("select s from Sharing s", Sharing.class)
                .getResultList();
    }

    public Sharing findById(long id) {
        return em.createQuery("select s from Sharing s where s.id =:id", Sharing.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
