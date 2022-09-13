package bera31.Project.domain.page;


import bera31.Project.domain.comment.Comment;
import bera31.Project.domain.member.Member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Contents {
    @Id @GeneratedValue
    @Column(name = "CONTENTS_ID")
    Long id;
    String title;
    Member user;
    List<Comment> comments;
    LocalDateTime postTime;
}
