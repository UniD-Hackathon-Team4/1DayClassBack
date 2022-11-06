package com.example.DayClassBack.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Participate extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="participate_id")
    private Long id;

    @OneToOne(targetEntity =Users.class)      // Many = Participate, Users = Party
    @JoinColumn(name="user_id")               // foreign key (userId) references User (id)
    private Users users;

    @ManyToOne (targetEntity =Party.class)   // (mappedBy ="Party", cascade=CascadeType.ALL, orphanRemoval=true)                   // Many = Participate, Users = Party
    @JoinColumn(name="party_id")             // foreign key (partyId) references Party (id)
    private Party party;

    @Column(nullable=false)
    private boolean is_selected;

}
