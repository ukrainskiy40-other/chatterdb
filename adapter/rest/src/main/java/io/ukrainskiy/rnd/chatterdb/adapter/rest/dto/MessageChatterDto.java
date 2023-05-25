package io.ukrainskiy.rnd.chatterdb.adapter.rest.dto;

import lombok.Data;

@Data
public class MessageChatterDto {

    private Long id;
    private String message;
    private Long userChatterId;
}
