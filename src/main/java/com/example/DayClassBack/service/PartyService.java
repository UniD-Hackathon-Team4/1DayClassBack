package com.example.DayClassBack.service;

import com.example.DayClassBack.dto.Response;
import com.example.DayClassBack.dto.request.PartyRequestDto;
import com.example.DayClassBack.dto.response.UserResponseDto;
import com.example.DayClassBack.entity.Party;
import com.example.DayClassBack.entity.Users;
import com.example.DayClassBack.enums.WriteType;
import com.example.DayClassBack.repository.PartyRepository;
import com.example.DayClassBack.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class PartyService {

    @Autowired
    PartyRepository partyRepository;
    UsersRepository userRepository;

    @Autowired
    UsersService usersService;
    private final Response response;



    public ResponseEntity<?> writeGather(PartyRequestDto.WriteGather party) {

        // usersRepository.findByEmail(login.getEmail())

        Party party1=Party.builder()
                .users(usersService.getUsersInfo(party.getUser_id()))
                // .users(party.getUsers())
                .number_of_people(party.getNumber_of_people())
                .cost(party.getCost())
                .ott(party.getOtt())
                //.is_completed(party.is_completed())
                .title(party.getTitle())
                .start_date(party.getStart_date())
                .end_date(party.getEnd_date())
                //.writeType(party.setWriteType(WriteType.Gather))
                .build();

        partyRepository.save(party1);

        return response.success("글 작성에 성공했습니다.");
    }

    public ResponseEntity<?> writeRental(PartyRequestDto.WriteRental party) {

        Party party2=Party.builder()
                .users(party.getUsers())
                //.number_of_people(party.getNumber_of_people())
                .cost(party.getCost())
                .ott(party.getOtt())
                //.is_completed(party.is_completed())
                .start_date(party.getStart_date())
                .end_date(party.getEnd_date())
                .title(party.getTitle())
                .build();

        partyRepository.save(party2);

        return response.success("글 작성에 성공했습니다.");
    }
}

