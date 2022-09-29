package bera31.Project.domain.memo;

import bera31.Project.domain.dto.ScheduleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    @Id @GeneratedValue
    long id;

    @Enumerated(EnumType.STRING)
    MemoCategory category;
    String title;
    LocalDateTime time;
    String place;
    String content;

    public void updateMemo(ScheduleDto memo) {
        this.title = memo.getTitle();
        this.category = memo.getCategory();
        this.time = memo.getTime();
        this.place = memo.getPlace();
        this.content = memo.getContent();

    }
}
