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
@RequestMapping("/api/groupBuying")
public class GroupBuyingController {

    private final GroupBuyingService groupBuyingService;

    @GetMapping
    public List<GroupBuyingListResponseDto> findAllGroupBuying() {
        return groupBuyingService.findAllGroupBuying();
    }

    @PostMapping
    public Long postGroupBuying(@RequestBody GroupBuyingRequestDto groupBuyingRequestDto) {
        return groupBuyingService.postGroupBuying(groupBuyingRequestDto);
    }

    @PostMapping("/update/{postId}")
    public Long updateGroupBuying(@RequestBody GroupBuyingRequestDto groupBuyingRequestDto, @PathVariable Long postId) {
        return groupBuyingService.updateGroupBuying(groupBuyingRequestDto, postId);
    }

    @GetMapping("/{postId}")
    public GroupBuyingResponseDto findGroupBuying(@PathVariable Long postId) {
        return groupBuyingService.findGroupBuying(postId);
    }

    @GetMapping("/search")
    public List<GroupBuyingListResponseDto> searchGroupBuying(@RequestParam String keyword) {
        return groupBuyingService.searchGroupBuying(keyword);
    }

    @PostMapping("/{postId}/heart")
    public void addFavoriteGroupBuying(@PathVariable Long postId){
        groupBuyingService.updateFavoriteGroupBuying(postId);
    }

    @DeleteMapping("/{postId}")
    public void deleteGroupBuying(@PathVariable Long postId){
        groupBuyingService.deleteGroupBuying(postId);
    }
}
