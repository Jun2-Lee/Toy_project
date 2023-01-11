package bera31.Project.service.page;


import bera31.Project.config.S3.S3Uploader;
import bera31.Project.domain.dto.requestdto.GroupBuyingRequestDto;
import bera31.Project.domain.dto.responsedto.GroupBuyingListResponseDto;
import bera31.Project.domain.dto.responsedto.GroupBuyingResponseDto;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.groupbuying.GroupBuying;
import bera31.Project.repository.MemberRepository;
import bera31.Project.repository.page.GroupBuyingRepository;
import bera31.Project.utility.SecurityUtility;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class GroupBuyingService {
    @Autowired
    private S3Uploader s3Uploader; // Field Injection 말고 다른 방법 생각해보기
    private final GroupBuyingRepository groupBuyingRepository;
    private final MemberRepository memberRepository;

    public List<GroupBuyingListResponseDto> searchGroupBuying(String keyword) {
        return groupBuyingRepository.findByKeyword(keyword)
                .stream()
                .map(GroupBuyingListResponseDto::new)
                .collect(Collectors.toList());
    }

    public List<GroupBuyingListResponseDto> findAllGroupBuying() {
        return groupBuyingRepository.findAll()
                .stream()
                .map(GroupBuyingListResponseDto::new)
                .collect(Collectors.toList());
    }

    public Long postGroupBuying(GroupBuyingRequestDto groupBuyingRequestDto, MultipartFile postImage) throws IOException {
        String currentMemberEmail = SecurityUtility.getCurrentMemberEmail();
        Optional<Member> findedMember = memberRepository.findByEmail(currentMemberEmail);
        GroupBuying newGroupBuying = new GroupBuying(groupBuyingRequestDto, findedMember.get());
        newGroupBuying.setImage(s3Uploader.upload(postImage, "groupBuying"));

        return groupBuyingRepository.save(newGroupBuying);
    }

    public Long updateGroupBuying(GroupBuyingRequestDto groupBuyingRequestDto, Long postId) {
        return groupBuyingRepository.findById(postId).update(groupBuyingRequestDto);
    }

    public GroupBuyingResponseDto findGroupBuying(Long postId) {
        return new GroupBuyingResponseDto(groupBuyingRepository.findById(postId));
    }

    public void updateFavoriteGroupBuying(Long postId){
        // 멤버 받아와서
        // member.getFavoriteRepository().find();
        // 이미 있는지 ? 없으면 ==> member.add 함수 실행
        //            있으면 ==> member.remove 함수 실행
        groupBuyingRepository.findById(postId);
    }

    public void deleteGroupBuying(Long postId) {
        groupBuyingRepository.delete(groupBuyingRepository.findById(postId));
    }
}
