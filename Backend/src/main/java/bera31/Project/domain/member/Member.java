package bera31.Project.domain.member;

import bera31.Project.domain.Address;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.message.Message;
import bera31.Project.domain.page.groupbuying.GroupBuying;
import bera31.Project.domain.page.sharing.Sharing;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
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

    @OneToMany(mappedBy = "user")
    List<Sharing> sharingList;

    @OneToMany
    @JoinColumn(name = "CONTENTS_ID")
    List<Sharing> favoriteSharing;

    @OneToMany(mappedBy = "user")
    List<GroupBuying> buyingList;

    @OneToMany
    @JoinColumn(name = "CONTENTS_ID")
    List<GroupBuying> favoriteBuying;

    @OneToMany
    @JoinColumn(name ="INGREDIENTS_ID")
    List<Ingredient> favoriteFood;

    @OneToMany
    List<Message> messages;

}
