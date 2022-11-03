package bera31.Project.domain.dto.page;

import bera31.Project.domain.Address;
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.sharing.Sharing;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 사진, 닉네임, 제목, 주소, deadline, 작성날짜, 찜
 */
@Getter
public class SharingResponseDto {
    String nickname;
    String title;
    Address location;
    LocalDateTime deadLine;
    LocalDateTime postTime;
    boolean favoriteSharing;

    public SharingResponseDto(Sharing sharing){
        this.nickname = sharing.getUser().getNickname();
        this.title = sharing.getTitle();
        this.location = sharing.getLocation();
        this.deadLine = sharing.getDeadLine();
        this.postTime = sharing.getPostTime();

        if(searchFavorite(sharing.getId(), sharing.getUser()))
            this.favoriteSharing = true;
        else this.favoriteSharing = false;
    }

    private boolean searchFavorite(Long id,Member member){
        for (Sharing sharing : member.getFavoriteSharing()) {
            if(Objects.equals(sharing.getId(), id)) return true;
        }
        return false;
    }
}
