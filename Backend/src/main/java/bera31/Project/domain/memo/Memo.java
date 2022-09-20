package bera31.Project.domain.memo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Memo {
    @Id @GeneratedValue
    long id;

    MemoCategory category;
    String title;
    LocalDateTime time;
    String place;
    String content;
}
