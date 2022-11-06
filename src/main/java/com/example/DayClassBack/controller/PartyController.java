package com.example.DayClassBack.controller;

import com.example.DayClassBack.dto.Response;
import com.example.DayClassBack.dto.request.PartyRequestDto;
import com.example.DayClassBack.enums.WriteType;
import com.example.DayClassBack.service.Helper;
import com.example.DayClassBack.service.PartyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/homebody/party")
@RestController
public class PartyController {

    private final PartyService partyService;
    private final Response response;

    @PostMapping("/gather")
    public ResponseEntity<?> writeGather(@Validated PartyRequestDto.WriteGather write, Errors errors) {
        // validation check
        if (errors.hasErrors()) {
            return response.invalidFields(Helper.refineErrors(errors));
        }
        write.setWriteType(WriteType.Gather);
        write.set_completed(true);

        return partyService.writeGather(write);
    }

    @PostMapping("/rental")
    public ResponseEntity<?> writeRental(@Validated PartyRequestDto.WriteRental write, Errors errors) {
        // validation check
        if (errors.hasErrors()) {
            return response.invalidFields(Helper.refineErrors(errors));
        }
        write.setWriteType(WriteType.Rental);
        write.set_completed(true);
        return partyService.writeRental(write);
    }
}
