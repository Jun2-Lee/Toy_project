package bera31.Project.api.controller;

import bera31.Project.domain.dto.requestdto.LogInDto;
import bera31.Project.domain.dto.requestdto.SignUpDto;
import bera31.Project.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping ("/signup")
    public Long signUp(@RequestBody SignUpDto signUpDto) throws Exception {
        return authService.signUp(signUpDto);
    }

    @PostMapping("/login")
    public void login(@RequestBody LogInDto logInDto){
        // authService.login(logInDto);
    }

    @PostMapping("/logout")
    public void logout(){
        // Redis에서 JWT RefreshToken 삭제함으로써 logout 구현
    }

    @PostMapping("/reissue")
    public void reissue(){
        // JWT Access Token이 만료된 경우, 재발급을 받아야합니다.
        // 재발급의 경우는 Refresh Token을 Key로 재발급.
        // Refresh Token은 Redis에 저장하도록 한다.ㄴ
    }
}
