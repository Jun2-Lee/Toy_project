package bera31.Project.service;

import bera31.Project.domain.Address;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.memo.Memo;
import bera31.Project.repository.IngredientRepository;
import bera31.Project.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;
    private final IngredientRepository ingredientRepository;



    public void changePassword(@RequestBody String password){
        //멤버 찾기(로그인 구현 후에 할 예정)
        //member.changePassword(password);
    }

    public void changeAddress(@RequestBody Address address){
        //멤버 찾기(로그인 구현 후에 할 예정)
        //member.changeAddress(address);
    }

    public void deleteFood(@RequestBody Long foodId){
        //멤버 찾기(로그인 구현 후에 할 예정)
        Ingredient findFood = ingredientRepository.findById(foodId);
        //member.deleteFood(findFood);
    }

    public void addFood(@RequestBody Long foodId){
        //멤버 찾기(로그인 구현 후에 할 예정)
        Ingredient findFood = ingredientRepository.findById(foodId);
        //member.addFood(findFood);
    }

    @Transactional(readOnly = true)
    public void/*List<Memo>*/ findMyMemo(){
        //멤버 찾기(로그인 구현 후에 할 예정)
        //return member.getMemoList();
    }

    public void deleteMember(){
        //멤버 찾기(로그인 구현 후에 할 예정)
        //memberRepository.delete(member);
    }
}
