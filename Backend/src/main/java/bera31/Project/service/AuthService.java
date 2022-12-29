package bera31.Project.service;

import bera31.Project.domain.dto.requestdto.SignUpDto;
import bera31.Project.domain.member.Member;
import bera31.Project.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    @Transactional
    public Long signUp(SignUpDto signUpDto) throws Exception {

        if (memberRepository.findByEmail(signUpDto.getEmail()).isPresent()) {
            throw new Exception("이미 있는 회원입니다");
        }

        if (memberRepository.findByNickName(signUpDto.getNickname()).isPresent()) {
            throw new Exception("이미 있는 닉네임입니다");
        }

        //memberRepository.save(member);
        return 0L;
    }


}
