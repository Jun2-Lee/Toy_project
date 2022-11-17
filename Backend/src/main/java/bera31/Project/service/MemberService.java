package bera31.Project.service;

import bera31.Project.domain.Address;
import bera31.Project.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public void changePassword(@RequestBody String password) {
        //멤버 찾기(로그인 구현 후에 할 예정)
        //member.changePassword(password);
    }

    public void changeMyInfo(@RequestBody Address address) {
        //멤버 찾기(로그인 구현 후에 할 예정)
        //member.changeAddress(address);
        //member.changeFood(List<Ingredient> ingredient);
        //member.changeImage(String image);
    }

    @Transactional(readOnly = true)
    public void/*List<Memo>*/ findMyMemo() {
        //멤버 찾기(로그인 구현 후에 할 예정)
        //return member.getMemoList();
    }

    public void deleteMember() {
        //멤버 찾기(로그인 구현 후에 할 예정)
        //memberRepository.delete(member);
    }

    public String findPassword(@RequestBody String email) throws Exception {
        if (memberRepository.findByEmail(email).isPresent())
            return memberRepository.findByEmail(email).get().getPassword();
        else
            throw new Exception("없는 이메일 입니다.");
    }
}
