package bera31.Project.service;

import bera31.Project.domain.member.Member;
import bera31.Project.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService {
    // 해당 Class는 비밀번호 암호화 때문에 만들게 됩니다.
    // 비교를 하는 원래 함수는 암호화 이전의 비밀번호 이기 때문에,
    // 암호화 된 상태의 비밀번호로 비교하는 함수가 필요합니다.
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return memberRepository.findByEmail(email)
                .map(this::createUserDetails)
                .orElseThrow(()->new UsernameNotFoundException("없는 회원 입니다."));
    }

    public UserDetails createUserDetails(Member member){
        return User.builder()
                .username(member.getEmail())
                .password(passwordEncoder.encode(member.getPassword()))
                .build();
    }
}
