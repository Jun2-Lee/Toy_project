package bera31.Project.domain.comment;

import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    Member user;

    LocalDateTime timeStamp;
    String content;

    @ManyToOne
    @JoinColumn(name = "PAR_COMMENT_ID")
    Comment parent;

    @OneToMany(mappedBy = "parent")
    List<Comment> children = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "CONTENTS_ID")
    Contents contents;
}

