package bera31.Project.repository;

import bera31.Project.domain.comment.Comment;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

    private final EntityManager em;

    public Comment save(Comment comment) {
        em.persist(comment);
        return comment;
    }

    public void delete(Comment comment) {
        em.remove(comment);
        return;
    }

    public List<Comment> findAll() {
        return em.createQuery("select c from Comment c", Comment.class)
                .getResultList();
    }

    public Comment findById(Long id) {
        return em.createQuery("select c from Comment c where c.id =:id", Comment.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
