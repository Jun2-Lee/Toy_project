package bera31.Project.domain.page;


import bera31.Project.domain.comment.Comment;
import bera31.Project.domain.member.Member;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Contents {
    @Id @GeneratedValue
    @Column(name = "CONTENTS_ID")
    Long id;
    String title;
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    Member user;

    @OneToMany(mappedBy = "contents")
    List<Comment> comments;
    LocalDateTime postTime;
}
