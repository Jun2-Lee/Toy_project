package bera31.Project.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("/api/members")
    public String getMemberInfo() {
        return "ok";
    }

    @PostMapping("/api/members/logout")
    public String logout() {
        return "ok";
    }

    @PutMapping("/api/members/address")
    public String changeAddress() {
        return "ok";
    }

    @PutMapping("/api/members/password")
    public String changePassword() {
        return "ok";
    }

    @PutMapping("/api/members/food")
    public String changeFood() {
        return "ok";
    }

    @DeleteMapping("/api/members")
    public String deleteMember() {
        return "ok";
    }

    @PutMapping("/api/members/photo")
    public String changeProfile() {
        return "ok";
    }
}
