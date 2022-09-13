package bera31.Project.domain.member;

import bera31.Project.domain.Address;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.message.Message;
import bera31.Project.domain.page.groupbuying.GroupBuying;
import bera31.Project.domain.page.sharing.Sharing;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    Long id;

    String email;
    String nickname;
    String password;
    String profileImage;
    @Embedded
    Address address;
    double manner;
    List<Sharing> sharingList;
    List<Sharing> favoriteSharing;
    List<GroupBuying> buyingList;
    List<GroupBuying> favoriteBuying;
    List<Ingredient> favoriteFood;

    @OneToMany
    List<Message> messages;

}
