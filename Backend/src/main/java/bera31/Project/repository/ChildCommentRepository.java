package bera31.Project.repository;

import bera31.Project.domain.comment.ChildComment;
import bera31.Project.domain.comment.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class ChildCommentRepository {
    private final EntityManager em;

    public ChildComment save(ChildComment childComment) {
        em.persist(childComment);
        return childComment;
    }

    public void delete(ChildComment childComment) {
        em.remove(childComment);
        return;
    }

    public ChildComment findById(Long id) {
        return em.createQuery("select cc from ChildComment cc where cc.id =:id", ChildComment.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
