package com.example.DayClassBack.dto.request;

import com.example.DayClassBack.entity.Users;
import com.example.DayClassBack.enums.Ott;
import com.example.DayClassBack.enums.WriteType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
// import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PartyRequestDto {

    @Getter
    @Setter
    public static class WriteGather {

        @NotNull(message = "필수 입력값입니다.")
        private Long user_id;
        // private Users users;

        // @NotEmpty(message = "필수 입력값입니다.")
        // private Type type;

        @NotNull(message = "필수 입력값입니다.")   // @NotEmpty 사용 시 error
        private int number_of_people;              // https://sjparkk-dev1og.tistory.com/m/145

        @NotNull(message = "필수 입력값입니다.")
        private int cost;

        @NotNull(message = "ott는 필수 입력값입니다.")
        private Ott ott;

        // @NotEmpty(message = "필수 입력값입니다.")
        // private boolean is_completed;

        @NotNull(message = "title은 필수 입력값입니다.")
        // @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", message = "이메일 형식에 맞지 않습니다.")
        private String title;

        // @NotEmpty(message = "content는 필수 입력값입니다.")
        // @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
        // private String content;

        @NotNull (message = "start_date은 필수 입력값입니다.")
        @DateTimeFormat(pattern = "yyyy.MM.dd")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd", timezone = "Asia/Seoul")
        private LocalDate start_date;

        // @NotNull (message = "start_date은 필수 입력값입니다.")
        @DateTimeFormat(pattern = "yyyy.MM.dd")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd", timezone = "Asia/Seoul")
        private LocalDate end_date;

        private WriteType writeType;

        private boolean is_completed;

        //type.setWriteType(WriteType.Gather);
    }

    @Getter
    @Setter
    public static class WriteRental {

        @NotNull(message = "필수 입력값입니다.")
        private Users users;

        // @NotEmpty(message = "필수 입력값입니다.")
        // private Type type;

        // @NotEmpty(message = "필수 입력값입니다.")
        // private int number_of_people;

        @NotNull(message = "필수 입력값입니다.")
        private int cost;

        @NotNull(message = "ott는 필수 입력값입니다.")
        private Ott ott;

        // @NotEmpty(message = "필수 입력값입니다.")
        // private boolean is_completed;

        @NotNull(message = "title은 필수 입력값입니다.")
        // @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", message = "이메일 형식에 맞지 않습니다.")
        private String title;

        // @NotEmpty(message = "content는 필수 입력값입니다.")
        // @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
        // private String content;

        //@NotNull (message = "start_date은 필수 입력값입니다.")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd", timezone = "Asia/Seoul")
        private LocalDate start_date;

        // @NotNull (message = "start_date은 필수 입력값입니다.")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd", timezone = "Asia/Seoul")
        private LocalDate end_date;

        private WriteType writeType;
        private boolean is_completed;


    }

}
