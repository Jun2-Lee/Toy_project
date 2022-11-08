package bera31.Project.domain.dto.requestdto;

import bera31.Project.domain.schedule.Schedule;
import bera31.Project.domain.schedule.ScheduleCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class ScheduleDto {
    Long id;
    ScheduleCategory category;
    String title;
    LocalDateTime time;
    String place;
    String content;

    @Builder
    public Schedule toMemo() {
        return Schedule.builder()
                .category(category)
                .title(title)
                .time(time)
                .place(place)
                .content(content).build();
    }
}
