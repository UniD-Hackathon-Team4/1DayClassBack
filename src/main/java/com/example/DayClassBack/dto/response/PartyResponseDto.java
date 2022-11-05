package com.example.DayClassBack.dto.response;

import com.example.DayClassBack.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

public class PartyResponseDto {

    @Builder
    @Getter
    @AllArgsConstructor
    public static class PartyWriteInfo {
        private int id;
        private int user_id;

        private String title;
        private String content;

        private Type type;

        private String refreshToken;
        private Long refreshTokenExpirationTime;
    }

}
