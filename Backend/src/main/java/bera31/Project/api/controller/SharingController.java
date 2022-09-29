package bera31.Project.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SharingController {

    @PostMapping("/api/sharingPosts")
    public String createSharing(){
        return "ok";
    }

    @GetMapping("/api/sharingPosts")
    public String sharingPosts(){
        return "ok";
    }

    @GetMapping("/api/sharingPosts/search")
    public String searchByKeyword(@RequestParam String keyword) {
        return "ok";
    }

    @GetMapping("/api/sharingPosts/{sharingId}")
    public String findSharing(@PathVariable String sharingId){
        return "ok";
    }

    @PutMapping("/api/sharingPosts/{sharingId}")
    public String changeSharing(@PathVariable String sharingId){
        return "ok";
    }

    @DeleteMapping("/api/sharingPosts/{sharingId}")
    public String deleteSharing(@PathVariable String sharingId){
        return "ok";
    }

}
