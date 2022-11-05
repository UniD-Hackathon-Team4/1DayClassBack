package com.example.DayClassBack.entity;

import com.example.DayClassBack.enums.Ott;
import com.example.DayClassBack.enums.Type;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Party extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne                  // Many = Party, Users = One 한명의 유저는 여러개의 게시글을 쓸 수 있다.
    @JoinColumn(name="user_id") // foreign key (userId) references User (id)
    private Users users;

    /*
    @Column
    @CreatedDate
    private LocalDateTime created_at;

    @Column
    private LocalDateTime updated_at;
     */

    @Column
    @Enumerated(EnumType.STRING)    // enum의 이름으로 지정
    private Type type;

    @Column
    private int number_of_people;

    @Column
    private LocalDateTime start_date;

    @Column
    private LocalDateTime end_date;

    @Column
    private int cost;

    @Column
    @Enumerated(EnumType.STRING)    // enum의 이름으로 지정
    private Ott ott;

    @Column
    private boolean is_completed;

    @Column
    private String title;

    @Column
    private String contents;

}
