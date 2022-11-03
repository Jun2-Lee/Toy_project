package bera31.Project.domain.dto.page;

import bera31.Project.domain.Address;
import bera31.Project.domain.comment.Comment;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.page.sharing.Sharing;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
//TODO: page패키지 없애고, request랑 response패키지로 나눠주기
@Getter
public class SharingDetailDto {

    Long id;
    Double manner;
    String nickname;
    String profileimage;
    String title;
    String content;
    Ingredient category;
    Address location;
    LocalDateTime deadLine;
    LocalDateTime expiry;
    LocalDateTime postTime;
    String image;
    List<Comment> comment;

    public SharingDetailDto(Sharing sharing){
        this.id = sharing.getId();
        this.manner = sharing.getUser().getManner();
        this.nickname = sharing.getUser().getNickname();
        this.profileimage = sharing.getUser().getProfileImage();
        this.title = sharing.getTitle();
        this.content = sharing.getContent();
        this.category = sharing.getCategory();
        this.location = sharing.getLocation();
        this.deadLine = sharing.getDeadLine();
        this.postTime = sharing.getPostTime();
        this.expiry = sharing.getExpiry();
        this.image = sharing.getImage();
        this.comment = sharing.getComments();
    }
}
