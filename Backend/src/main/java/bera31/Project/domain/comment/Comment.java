package bera31.Project.domain.comment;

import bera31.Project.domain.member.Member;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Comment {
    @Id
    Long id;

    Member user;
    LocalDateTime timeStamp;
    String content;
    Comment parent;
    List<Comment> children;
}

