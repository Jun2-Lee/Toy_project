package bera31.Project.service;

import bera31.Project.domain.dto.requestdto.ScheduleDto;
import bera31.Project.domain.schedule.Schedule;
import bera31.Project.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public void postSchedule(@RequestBody ScheduleDto scheduleDto) {
        // 로그인한 Member 찾기.

        Schedule memo = scheduleDto.toMemo();
        // member.addMemo();
        scheduleRepository.save(memo);
    }

    @Transactional
    public void updateSchedule(@RequestBody ScheduleDto scheduleDto) {
        Schedule findMemo = scheduleRepository.findById(scheduleDto.getId());
        findMemo.updateSchedule(scheduleDto);
    }

    public void deleteSchedule(@RequestBody ScheduleDto scheduleDto) {

        scheduleRepository.delete(scheduleRepository.findById(scheduleDto.getId()));

    }
}
