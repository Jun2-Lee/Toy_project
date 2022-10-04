package bera31.Project.service.page;

import bera31.Project.domain.dto.page.SharingDto;
import bera31.Project.domain.page.sharing.Sharing;
import bera31.Project.repository.page.SharingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Transactional
public class SharingService {
    private final SharingRepository sharingRepository;

    public void postSharing(@RequestBody SharingDto sharingDto){
        Sharing sharing = sharingDto.toSharing();
        sharingRepository.save(sharing);
    }

    public void uploadSharing(){

    }

    public void deleteSharing(){

    }




}
