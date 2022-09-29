package bera31.Project.domain.dto;

import bera31.Project.domain.memo.Memo;
import bera31.Project.domain.memo.MemoCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class ScheduleDto {

    MemoCategory category;
    String title;
    LocalDateTime time;
    String place;
    String content;

    @Builder
    public Memo toMemo(){
        return Memo.builder()
                .category(category)
                .title(title)
                .time(time)
                .place(place)
                .content(content).build();
    }
}
