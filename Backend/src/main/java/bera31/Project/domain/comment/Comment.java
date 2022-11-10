package bera31.Project.domain.comment;

import bera31.Project.domain.dto.requestdto.CommentRequestDto;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
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

    public Comment(CommentRequestDto commentRequestDto, Member member, Contents contents) {
        this.user = member;
        this.timeStamp = LocalDateTime.now();
        this.content = commentRequestDto.getContent();
        this.contents = contents;
    }
    public Comment(CommentRequestDto commentRequestDto, Member member, Comment comment) {
        this.user = member;
        this.timeStamp = LocalDateTime.now();
        this.content = commentRequestDto.getContent();
        this.contents = comment.getContents();
        this.parent = comment;
    }
    public void addChild(Comment comment){
        this.children.add(comment);
    }
}

