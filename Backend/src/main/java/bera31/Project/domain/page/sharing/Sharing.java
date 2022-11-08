package bera31.Project.domain.page.sharing;

import bera31.Project.domain.Address;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@SuperBuilder
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
