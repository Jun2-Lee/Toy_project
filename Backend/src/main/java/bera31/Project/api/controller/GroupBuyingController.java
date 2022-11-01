package bera31.Project.api.controller;

import bera31.Project.domain.dto.requestdto.GroupBuyingRequestDto;
import bera31.Project.domain.dto.responsedto.GroupBuyingListResponseDto;
import bera31.Project.domain.dto.responsedto.GroupBuyingResponseDto;
import bera31.Project.service.page.GroupBuyingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GroupBuyingController {

    private final GroupBuyingService groupBuyingService;

    @GetMapping("/api/groupBuying")
    public List<GroupBuyingListResponseDto> findAllGroupBuying(){
        return groupBuyingService.findAllGroupBuying();
    }

    @PostMapping("/api/groupBuying")
    public Long postGroupBuying(@RequestBody GroupBuyingRequestDto groupBuyingRequestDto){
        return groupBuyingService.postGroupBuying(groupBuyingRequestDto);
    }

    @GetMapping("/api/groupBuying/{postId}")
    public GroupBuyingResponseDto findGroupBuying(@PathVariable Long postId){
        return new GroupBuyingResponseDto();
    }

    @PostMapping("/api/groupBuying/{keyword}")
    public List<GroupBuyingListResponseDto> searchGroupBuying(@PathVariable String keyword){
        return groupBuyingService.searchGroupBuying(keyword);
    }
}
