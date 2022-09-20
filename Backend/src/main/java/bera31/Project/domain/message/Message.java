package bera31.Project.domain.message;

import bera31.Project.domain.member.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Message {
    @Id @GeneratedValue
    @Column(name = "MESSAGE_ID")
    Long id;
    LocalDateTime sendTime;

    @ManyToOne
    @JoinColumn(name = "SENDER_MEMBER_ID")
    Member sender;

    @ManyToOne
    @JoinColumn(name = "RECEIVER_MEMBER_ID")
    Member receiver;
    String content;
}
