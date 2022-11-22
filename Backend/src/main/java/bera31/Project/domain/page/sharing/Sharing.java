package bera31.Project.domain.page.sharing;

import bera31.Project.domain.Address;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Sharing extends Contents {
    String category;
    String product;
    LocalDateTime expiry;

    @OneToOne
    @JoinColumn
    Member receiver;

    LocalDateTime deadLine;

    @Embedded
    Address location;

    boolean isFinish;

    String image;
    String content;
}
