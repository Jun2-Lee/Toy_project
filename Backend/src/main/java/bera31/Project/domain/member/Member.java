package bera31.Project.domain.member;

import bera31.Project.domain.Address;
import bera31.Project.domain.ingredient.Ingredient;
import bera31.Project.domain.message.Room;
import bera31.Project.domain.schedule.Schedule;
import bera31.Project.domain.message.Message;
import bera31.Project.domain.page.dutchpay.DutchPay;
import bera31.Project.domain.page.groupbuying.GroupBuying;
import bera31.Project.domain.page.intersection.DutchPayIntersection;
import bera31.Project.domain.page.intersection.GroupBuyingIntersection;
import bera31.Project.domain.page.sharing.Sharing;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @OneToMany(mappedBy = "member1")
    List<Room> roomList = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    List<Schedule> memoList = new ArrayList<>();

    public void changePassword(String password){
        this.password = password;
    }

    public void changeAddress(Address address){
        this.address = address;
    }

    public void changeFood(List<Ingredient> ingredients){this.favoriteFood = ingredients;}

    public void changeImage(String image){this.profileImage = image;}

    public void addMemo(Schedule schedule){
        this.memoList.add(schedule);
    }

    public void addSharing(Sharing sharing){
        this.sharingList.add(sharing);
    }
}
