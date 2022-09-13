package bera31.Project.domain.message;

import bera31.Project.domain.member.Member;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Message {
    @Id @GeneratedValue
    @Column(name = "MESSAGE_ID")
    Long id;
    LocalDateTime sendTime;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    Member sender;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    Member receiver;
    String content;
}
