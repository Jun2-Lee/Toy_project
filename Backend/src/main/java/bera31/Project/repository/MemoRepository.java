package bera31.Project.repository;

import bera31.Project.domain.memo.Memo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemoRepository {

    private final EntityManager em;

    public Memo save(Memo memo){
        em.persist(memo);
        return memo;
    }

    public void delete(Memo memo){
        em.remove(memo);
        return;
    }

    public List<Memo> findAll(){
        return em.createQuery("select m from Memo m", Memo.class)
                .getResultList();
    }

    public Memo findById(Long id) {
        return em.createQuery("select m from Memo m where m.id =:id", Memo.class)
                .setParameter("id", id)
                .getSingleResult();
    }

}
