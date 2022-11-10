package bera31.Project.domain.page.sharing;

import bera31.Project.domain.Address;
<<<<<<< HEAD
import bera31.Project.domain.dto.requestdto.SharingRequestDto;
=======
>>>>>>> main
import bera31.Project.domain.member.Member;
import bera31.Project.domain.page.Contents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sharing extends Contents {
    String category;
    String product;
    LocalDateTime expiry;

    @OneToOne
    @JoinColumn
    Member receiver;

    LocalDateTime deadLine;

    @Embedded
    Address location;

    boolean isFinish;

    String image;
    String content;
<<<<<<< HEAD

    public Sharing(SharingRequestDto sharingRequestDto){
        this.category = sharingRequestDto.getCategory();
        this.product = sharingRequestDto.getProduct();
        this.expiry =  sharingRequestDto.getExpiry();
        this.deadLine = sharingRequestDto.getDeadLine();
        this.isFinish = false;
        this.location = sharingRequestDto.getLocation();
        this.image = sharingRequestDto.getImage();
        this.content = sharingRequestDto.getContent();

    }

    public void updateSharing(SharingRequestDto sharing){
        this.title = sharing.getTitle();
        this.content = sharing.getContent();
        this.category = sharing.getCategory();
        this.product = sharing.getProduct();
        this.expiry = sharing.getExpiry();
        this.location = sharing.getLocation();
        this.deadLine = sharing.getDeadLine();
        this.image = sharing.getImage();
    }
=======
>>>>>>> main
}
