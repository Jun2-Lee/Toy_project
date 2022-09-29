package bera31.Project.service;

import bera31.Project.domain.dto.ScheduleDto;
import bera31.Project.domain.memo.Memo;
import bera31.Project.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemoService {
    private final MemoRepository memoRepository;

    public void postSchedule(@RequestBody ScheduleDto scheduleDto){
        // 로그인한 Member 찾기.

        Memo memo = scheduleDto.toMemo();
        // member.addMemo();
        memoRepository.save(memo);
    }

    @Transactional
    public void updateSchedule(Long id, @RequestBody ScheduleDto scheduleDto){
        Memo findMemo = memoRepository.findById(id);
        findMemo.updateMemo(scheduleDto);
    }

    public void deleteSchedule(){

    }
}
