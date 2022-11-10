package bera31.Project.domain.dto.responsedto;

import bera31.Project.domain.Address;
import bera31.Project.domain.comment.Comment;
import bera31.Project.domain.page.sharing.Sharing;

import java.time.LocalDateTime;
import java.util.List;

public class SharingResponseDto {

    Long id;
    Double manner;
    String nickname;
    String profileImage;
    String title;
    String content;
    String category;
    String product;
    Address location;
    LocalDateTime deadLine;
    LocalDateTime expiry;
    LocalDateTime postTime;
    String image;
    List<Comment> comment;

    public SharingResponseDto(Sharing sharing){
        this.id = sharing.getId();
        this.manner = sharing.getUser().getManner();
        this.nickname = sharing.getUser().getNickname();
        this.profileImage = sharing.getUser().getProfileImage();
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
