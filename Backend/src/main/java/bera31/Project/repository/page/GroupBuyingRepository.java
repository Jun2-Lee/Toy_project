package bera31.Project.repository.page;

import bera31.Project.domain.page.groupbuying.GroupBuying;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;


@Repository
@RequiredArgsConstructor
public class GroupBuyingRepository {

    private final EntityManager em;

    public GroupBuying save(GroupBuying groupBuying){
        em.persist(groupBuying);
        return groupBuying;
    }

    public void delete(GroupBuying groupBuying){
        em.remove(groupBuying);
        return;
    }

    public List<GroupBuying> findAll(){
        return em.createQuery("select g from GroupBuying g", GroupBuying.class)
                .getResultList();
    }

    public GroupBuying findById(long id){
        return em.createQuery("select g from GroupBuying g where g.id =:id", GroupBuying.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
