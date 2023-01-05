package bera31.Project.service;

import bera31.Project.config.jwt.JwtTokenProvider;
import bera31.Project.domain.dto.requestdto.LogInDto;
import bera31.Project.domain.dto.requestdto.SignUpDto;
import bera31.Project.domain.dto.responsedto.AuthTokenDto;
import bera31.Project.domain.member.Member;
import bera31.Project.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final JwtTokenProvider tokenProvider;

    public Long signUp(SignUpDto signUpDto) throws Exception {

        if (memberRepository.findByEmail(signUpDto.getEmail()).isPresent()) {
            throw new Exception("이미 있는 회원입니다");
        }

        if (memberRepository.findByNickName(signUpDto.getNickname()).isPresent()) {
            throw new Exception("이미 있는 닉네임입니다");
        }

        Member member = new Member();
        return member.getId();
    }

    public AuthTokenDto signIn(LogInDto logInDto){
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
                = new UsernamePasswordAuthenticationToken(logInDto.getEmail(), logInDto.getPassword());
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(usernamePasswordAuthenticationToken);
        AuthTokenDto authTokenDto = tokenProvider.generateToken(authentication);

        // Refresh Token을 Redis에 저장하는 Code
        return authTokenDto;
    }
}
