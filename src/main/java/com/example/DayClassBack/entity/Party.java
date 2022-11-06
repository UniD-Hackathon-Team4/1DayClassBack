package com.example.DayClassBack.entity;

import com.example.DayClassBack.enums.Ott;
import com.example.DayClassBack.enums.WriteType;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Party extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="party_id")
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
    private WriteType writeType;

    @NotNull
    @Column
    private int number_of_people;

    @Column
    @DateTimeFormat(pattern = "yyyy.MM.dd")
    private LocalDate start_date;

    @Column
    @DateTimeFormat(pattern = "yyyy.MM.dd")
    private LocalDate end_date;

    @NotNull
    @Column(nullable = false)
    private int cost;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)    // enum의 이름으로 지정
    private Ott ott;

    @Column(nullable = false)
    private boolean is_completed;

    @Column(nullable = false)
    private String title;

    // @Column(nullable = false)
    // private String contents;

}
