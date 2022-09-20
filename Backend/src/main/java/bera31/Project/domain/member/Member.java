package bera31.Project.domain.member;

import bera31.Project.domain.Address;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.memo.Memo;
import bera31.Project.domain.message.Message;
import bera31.Project.domain.page.dutchpay.DutchPay;
import bera31.Project.domain.page.groupbuying.GroupBuying;
import bera31.Project.domain.page.intersection.DutchPayIntersection;
import bera31.Project.domain.page.intersection.GroupBuyingIntersection;
import bera31.Project.domain.page.sharing.Sharing;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
    List<Sharing> sharingList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<GroupBuying> buyingList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<DutchPay> dutchPayList = new ArrayList<>();

    @OneToMany(mappedBy = "participant")
    List<GroupBuyingIntersection> gbi = new ArrayList<>();

    @OneToMany(mappedBy = "participant")
    List<DutchPayIntersection> dpi = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    List<Sharing> favoriteSharing = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    List<GroupBuying> favoriteBuying = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    List<Ingredient> favoriteFood = new ArrayList<>();

    @OneToMany(mappedBy = "receiver")
    List<Message> receivedMessage = new ArrayList<>();

    @OneToMany(mappedBy = "sender")
    List<Message> sendMessage = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    List<Memo> memoList = new ArrayList<>();
}
