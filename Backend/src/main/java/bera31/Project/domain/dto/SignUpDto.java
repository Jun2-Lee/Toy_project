package bera31.Project.domain.dto;

import bera31.Project.domain.Address;
import bera31.Project.domain.member.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class SignUpDto {
    String email;
    String password;
    String nickname;
    String profileImage;
    Address address;


    @Builder
    public Member toMember(){
        return Member.builder()
                .email(email)
                .password(password)
                .nickname(nickname)
                .profileImage(profileImage)
                .address(address)
                .manner(0.0)
                .build();
    }
}
