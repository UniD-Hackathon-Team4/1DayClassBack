package com.example.DayClassBack.dto.request;

import com.example.DayClassBack.enums.Ott;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
// import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

public class PartyRequestDto {

    @Getter
    @Setter
    public static class Write {

        @NotEmpty(message = "title은 필수 입력값입니다.")
        // @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", message = "이메일 형식에 맞지 않습니다.")
        private String title;

        @NotEmpty(message = "content는 필수 입력값입니다.")
        // @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
        private String content;

        @NotEmpty(message = "필수 입력값입니다.")
        private int number_of_people;

        @NotEmpty(message = "필수 입력값입니다.")
        private LocalDateTime start_date;

        @NotEmpty(message = "필수 입력값입니다.")
        private LocalDateTime end_date;

        @NotEmpty(message = "필수 입력값입니다.")
        private int cost;

        @NotEmpty(message = "ott는 필수 입력값입니다.")
        private Ott ott;

        @NotEmpty(message = "o필수 입력값입니다.")
        private boolean is_completed;
    }

}
