package bera31.Project.repository;

import bera31.Project.domain.memo.Memo;
import bera31.Project.domain.message.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MessageRepository {
    private final EntityManager em;

    public Message save(Message message){
        em.persist(message);
        return message;
    }

    public void delete(Message message){
        em.remove(message);
        return;
    }

    public List<Message> findAll(){
        return em.createQuery("select m from Message m", Message.class)
                .getResultList();
    }

    public Message findById(Long id) {
        return em.createQuery("select m from Message m where m.id =:id", Message.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
