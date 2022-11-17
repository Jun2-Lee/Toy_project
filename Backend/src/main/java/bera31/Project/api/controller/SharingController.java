package bera31.Project.api.controller;

import bera31.Project.domain.dto.requestdto.SharingRequestDto;
import bera31.Project.domain.dto.responsedto.SharingListResponseDto;
import bera31.Project.domain.dto.responsedto.SharingResponseDto;
import bera31.Project.service.page.SharingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SharingController {

    private final SharingService sharingService;

    @GetMapping("/api/sharing")
    public List<SharingListResponseDto> findAllSharing(){
        return sharingService.findAllSharing();
    }

    @GetMapping("/api/sharing/{sharingId}")
    public SharingResponseDto findSharing(@PathVariable long sharingId){
        return sharingService.findSharing(sharingId);
    }

    @PostMapping("/api/sharing")
    public void createSharing(@RequestBody SharingRequestDto sharingRequestDto) {
        sharingService.postSharing(sharingRequestDto);
    }

    @PostMapping("/api/sharing/{id}")
    public void updateSharing(@PathVariable long sharingId, @RequestBody SharingRequestDto sharingRequestDto) {
        sharingService.updateSharing(sharingId, sharingRequestDto);
    }

    @DeleteMapping("/api/sharing/{sharingId}")
    public void deleteSharing(@PathVariable long sharingId) {
        sharingService.deleteSharing(sharingId);
    }

    @GetMapping("/api/sharingPosts/search")
    public String searchByKeyword(@RequestParam String keyword) {
        return "ok";
    }
}
