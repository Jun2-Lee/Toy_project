package bera31.Project.service.page;

import bera31.Project.domain.dto.page.SharingDetailDto;
import bera31.Project.domain.dto.page.SharingDto;
import bera31.Project.domain.dto.page.SharingResponseDto;
import bera31.Project.domain.dto.page.SharingUpdateDto;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.sharing.Sharing;
import bera31.Project.repository.page.SharingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class SharingService {
    private final SharingRepository sharingRepository;

    public void postSharing(@RequestBody SharingDto sharingDto){
        Sharing sharing = sharingDto.toSharing();
        sharingRepository.save(sharing);
    }

    @Transactional
    public void updateSharing(Long id, @RequestBody SharingUpdateDto sharingUpdateDto){
        Sharing findSharing = sharingRepository.findById(id);
        findSharing.updateSharing(sharingUpdateDto);
    }

    @Transactional
    public void deleteSharing(Long id){
        Sharing sharing = sharingRepository.findById(id);
        sharingRepository.delete(sharing);
    }

    @Transactional(readOnly = true)
    public List<SharingResponseDto> findAllSharing(){
        return sharingRepository.findAll().stream()
                .map(SharingResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public SharingDetailDto findSharing(Long id){
        SharingDetailDto sharing = sharingRepository.detail(id);
        return sharing;
    }

}
